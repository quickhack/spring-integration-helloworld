package com.oldratlee.si.demo.hw3;

import com.oldratlee.si.demo.hw2.Greeter;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("/helloworld.xml")
public class HelloWorldTest {

    @Autowired
    Greeter greeter;

    @Test
    public void testHelloWorld() {
        System.out.println("Started..");
        long start = System.nanoTime();
        for (int i = 0; i < 10; i++) {
            this.greeter.sendGreeting(String.format("Hello World %d", i));
        }
        System.out.println("Completed..");
        System.out.println(String.format("Took %f ms", (System.nanoTime() - start) / 10e6));
    }
}
