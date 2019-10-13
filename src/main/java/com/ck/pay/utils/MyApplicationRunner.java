package com.ck.pay.utils;

import com.ck.pay.dao.SettingDao;
import com.ck.pay.entity.Setting;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class MyApplicationRunner implements ApplicationRunner {

    private static final Logger log = LoggerFactory.getLogger(MyApplicationRunner.class);

    @Value("${control.username}")
    private String username;

    @Value("${control.password}")
    private String password;

    @Value("${control.key}")
    private String key;

    @Value("${control.close:5}")
    private String close;

    @Value("${control.url.notify:}")
    private String notifyUrl;

    @Value("${control.url.return:}")
    private String returnUrl;

    @Autowired
    private SettingDao settingDao;

    @Override
    public void run(ApplicationArguments var1) {
        log.info("开始初始化操作...");

        //查询是不是首次启动，如果是就创建基础的设置数据
        int row = (int) settingDao.count();
        if (row == 0) {
            log.info("检测到系统为首次启动，正在进行数据库初始化...");
            Setting setting = new Setting();
            //管理员账号
            setting.setVkey("user");
            setting.setVvalue(username);
            settingDao.save(setting);

            //管理员密码
            setting.setVkey("pass");
            setting.setVvalue(password);
            settingDao.save(setting);

            //异步通知地址
            setting.setVkey("notifyUrl");
            setting.setVvalue(notifyUrl);
            settingDao.save(setting);

            //同步通知地址
            setting.setVkey("returnUrl");
            setting.setVvalue(returnUrl);
            settingDao.save(setting);

            //通讯密钥
            setting.setVkey("key");
            setting.setVvalue(key);
            settingDao.save(setting);

            //监控端最后心跳
            setting.setVkey("lastheart");
            setting.setVvalue("0");
            settingDao.save(setting);

            //监控端最后收款
            setting.setVkey("lastpay");
            setting.setVvalue("0");
            settingDao.save(setting);

            //监控端状态
            setting.setVkey("jkstate");
            setting.setVvalue("-1");
            settingDao.save(setting);

            //订单最有效时间
            setting.setVkey("close");
            setting.setVvalue(close);
            settingDao.save(setting);

            //区分方式
            setting.setVkey("payQf");
            setting.setVvalue("1");
            settingDao.save(setting);

            //微信通用收款码
            setting.setVkey("wxpay");
            setting.setVvalue("");
            settingDao.save(setting);
            //支付宝通用收款码
            setting.setVkey("zfbpay");
            setting.setVvalue("");
            settingDao.save(setting);

        }
        log.info("系统启动完成！");

    }
}
