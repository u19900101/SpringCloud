package ppppp.controller;

/**
 * @author pppppp
 * @date 2021/7/11 22:32
 */
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import ppppp.service.IMessageProvider;

import javax.annotation.Resource;

@RestController
public class SendMessageController
{
    @Resource
    private IMessageProvider messageProvider;

    @GetMapping(value = "/sendMessage")
    public String sendMessage() {
        return messageProvider.send();
    }

}
