# DemoUtils


# spring 4 spring1.5.9
Spring Verision : 4.3.13.RELEASE, Sring Boot Version : 1.5.9.RELEASE.

我是环绕通知之前AAA
********@Before我是前置通知
===>CalcServiceImpl被调用，计算结果为：5
我是环绕通知之后BBB
********@After我是后置通知
********@AfterReturning我是返回后通知



Spring Verision : 4.3.13.RELEASE, Sring Boot Version : 1.5.9.RELEASE.

我是环绕通知之前AAA
********@Before我是前置通知
********@After我是后置通知
********@AfterThrowing我是异常通知

java.lang.ArithmeticException: / by zero
	at com.lun.interview.service.CalcServiceImpl.div(CalcServiceImpl.java:10)
	at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
	at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.lang.reflect.Method.invoke(Method.java:498)
————————————————




# spring5

Spring Verision : 5.2.8.RELEASE, Sring Boot Version : 2.3.3.RELEASE.

我是环绕通知之前AAA
********@Before我是前置通知
===>CalcServiceImpl被调用，计算结果为：5
********@AfterReturning我是返回后通知
********@After我是后置通知
我是环绕通知之后BBB


Spring Verision : 5.2.8.RELEASE, Sring Boot Version : 2.3.3.RELEASE.

我是环绕通知之前AAA
********@Before我是前置通知
********@AfterThrowing我是异常通知
********@After我是后置通知

java.lang.ArithmeticException: / by zero
	at com.lun.interview.service.CalcServiceImpl.div(CalcServiceImpl.java:10)
	at com.lun.interview.service.CalcServiceImpl$$FastClassBySpringCGLIB$$355acbc4.invoke(<generated>)
	at org.springframework.cglib.proxy.MethodProxy.invoke(MethodProxy.java:218)
	at org.springframework.aop.framework.CglibAopProxy$CglibMethodInvocation.invokeJoinpoint(CglibAopProxy.java:771)
