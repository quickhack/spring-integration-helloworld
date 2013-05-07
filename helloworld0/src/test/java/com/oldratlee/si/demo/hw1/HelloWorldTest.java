package com.oldratlee.si.demo.hw1;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.integration.Message;
import org.springframework.integration.MessageChannel;
import org.springframework.integration.message.GenericMessage;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("/helloworld.xml")
public class HelloWorldTest {

    @Autowired
    @Qualifier("messageChannel")
    MessageChannel messageChannel;

    @Test
    public void testHelloWorld() {
        Message<String> helloWorld = new GenericMessage<String>("Hello World");
        messageChannel.send(helloWorld);
    }
}
