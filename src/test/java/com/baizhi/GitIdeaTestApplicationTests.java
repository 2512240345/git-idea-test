package com.baizhi;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class GitIdeaTestApplicationTests {

    @Test
    public void contextLoads() {
        System.out.println("哈哈哈哈");
        String[] a = {"1","2","3"};
        for (int i = 0; i < a.length; i++) {
            String s = a[i];
            System.out.println(s);
        }
    }

}
