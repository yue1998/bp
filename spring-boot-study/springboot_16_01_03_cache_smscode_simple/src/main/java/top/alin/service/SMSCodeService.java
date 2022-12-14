package top.alin.service;

import top.alin.pojo.SMSCode;

/**
 * @Author CandyWall
 * @Date 2022/2/13--21:15
 * @Description
 */
public interface SMSCodeService {
    String sendCodeToSMS(String phone);

    boolean checkCode(SMSCode smsCode);
}
