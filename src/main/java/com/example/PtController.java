package com.example;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

/**
 * Created by a1849 on 2016/11/26.
 */
@Controller
public class PtController {
@MessageMapping("/welcome")
@SendTo("/topic/getResponse")
    public PeterResponse say(PeterMessage peterMessage) throws Exception{
        Thread.sleep(1000);
        return new PeterResponse("Welcome ," + peterMessage.getName() +"!");
    }
}
