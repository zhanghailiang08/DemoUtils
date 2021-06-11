package com.AQS.demo;


/**
 * 自定义同步器在实现的时候，只需要实现共享资源state的获取和释放即可，至于具体线程等待队列的维护，AQS已经在顶层实现好了。自定义同步器实现的时候，主要实现下面几种方法：
 *
 * - isHeldExclusively()：该线程是否正在独占资源。只有用到condition才需要实现它
 * - tryAcquire(int)：独占方式。尝试获取资源，成功则返回true，失败则返回false。
 * - tryRelease(int)：独占方式，尝试释放资源，成功则返回true，失败则返回false
 * - tryAcquireShared(int)：共享方式，尝试获取资源。负数表示失败，0表示成功，但没有剩余可用资源；正数表示成功，且有剩余资源。
 * - tryReleaseShared(int)：共享方式。尝试释放资源，如果允许释放后允许唤醒后续等待节点返回true，否则返回false。
 *
 *
 * ReentrantLock
 *
 * 以ReentrantLock（可重入独占式锁）为例，state初始化为0，表示未锁定状态，A线程lock()时，会调用tryAcquire()独占锁，并将state + 1，
 * 之后其它线程在想通过tryAcquire的时候就会失败，知道A线程unlock() 到 state = 0 为止，其它线程才有机会获取到该锁。
 * A释放锁之前，自己也是可以重复获取此锁（state累加），这就是可重入的概念。
 *
 * 注意：获取多少次锁就需要释放多少次锁，保证state是能够回到0
 *
 *
 *CountDownLatch
 *
 * 以CountDownLatch为例，任务分N个子线程执行，state就初始化为N，N个线程并行执行，每个线程执行完之后 countDown() 一次，state 就会CAS减1，
 * 当N子线程全部执行完毕，state = 0,hui unpark() 主调动线程，主调用线程就会从await()函数返回，继续之后的动作。
 */
import java.util.concurrent.locks.AbstractQueuedSynchronizer;



public class Sync extends AbstractQueuedSynchronizer {

    @Override
    protected boolean tryAcquire(int arg) {
        // 使用自旋锁 ，同时CAS必须保证原子性
        // 目前的CPU底层汇编都有这条指令了，即支持原语操作
        if (compareAndSetState(0, 1)) {
            // 设置排它的拥有者，也就是互斥锁
            setExclusiveOwnerThread(Thread.currentThread());
            return true;
        }
        return false;
    }

    @Override
    protected boolean tryRelease(int arg) {
        assert arg == 1;
        if (!isHeldExclusively()) {
            throw new IllegalMonitorStateException();
        }
        // 释放锁
        setExclusiveOwnerThread(null);
        setState(0);
        return super.tryRelease(arg);
    }

    @Override
    protected boolean isHeldExclusively() {
        // 判断当前线程 是不是和排它锁的线程一样
        return getExclusiveOwnerThread() == Thread.currentThread();
    }


}
