package com.lun.application;

//import org.junit.Test;
//import org.junit.runner.RunWith;
import com.lun.service.CalcService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringBootVersion;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.SpringVersion;
//import org.springframework.test.context.junit4.SpringRunner;


@SpringBootTest
//@RunWith(SpringRunner.class)
public class AopTest {

    @Autowired
    private CalcService calcService;

    @Test
    public void testAop4() {
        System.out.println(String.format("Spring Verision : %s, Sring Boot Version : %s.", //
                SpringVersion.getVersion(), SpringBootVersion.getVersion()));

        calcService.div(10, 0);
    }
}


