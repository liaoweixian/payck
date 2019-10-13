package com.ck.pay.service;

import com.ck.pay.dao.PayOrderDao;
import com.ck.pay.dao.SettingDao;
import com.ck.pay.dao.TmpPriceDao;
import com.ck.pay.entity.PayOrder;
import com.ck.pay.entity.Setting;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;

@Component
public class QuartzService {

    private static final Logger log = LoggerFactory.getLogger(QuartzService.class);

    @Autowired
    private SettingDao settingDao;
    @Autowired
    private PayOrderDao payOrderDao;
    @Autowired
    private TmpPriceDao tmpPriceDao;


    @Scheduled(fixedRate = 30000)
    public void timerToZZP() {
        try {
            log.info("开始清理过期订单...");
            String timeout = settingDao.findById("close").get().getVvalue();
            String closeTime = String.valueOf(new Date().getTime());
            timeout = String.valueOf(new Date().getTime() - Integer.valueOf(timeout) * 60 * 1000);

            int row = payOrderDao.setTimeout(timeout, closeTime);

            List<PayOrder> payOrders = payOrderDao.findAllByCloseDate(Long.valueOf(closeTime));
            for (PayOrder payOrder : payOrders) {
                tmpPriceDao.delprice(payOrder.getType() + "-" + payOrder.getReallyPrice());
            }
            log.info("成功清理{}个订单", row);
        } catch (Exception e) {
            log.error("定时清理订单出现异常！", e);
        }

        String lastheart = settingDao.findById("lastheart").get().getVvalue();
        String state = settingDao.findById("jkstate").get().getVvalue();
        if (state.equals("1") && new Date().getTime() - Long.valueOf(lastheart) > 60 * 1000) {
            Setting setting = new Setting();
            setting.setVkey("jkstate");
            setting.setVvalue("0");
            settingDao.save(setting);
        }


    }
}
