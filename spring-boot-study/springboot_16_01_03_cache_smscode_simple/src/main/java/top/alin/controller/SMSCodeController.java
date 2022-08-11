package top.alin.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import top.alin.pojo.SMSCode;
import top.alin.service.SMSCodeService;

/**
 * @Author CandyWall
 * @Date 2022/2/13--21:17
 * @Description
 */
@RestController
@RequestMapping("/smscode")
public class SMSCodeController {
    @Autowired
    SMSCodeService smsCodeService;

    @GetMapping("{phone}")
    public String getCode(@PathVariable String phone) {
        return smsCodeService.sendCodeToSMS(phone);
    }

    @PostMapping
    public boolean checkCode(@RequestBody SMSCode smsCode) {
        return smsCodeService.checkCode(smsCode);
    }
}
