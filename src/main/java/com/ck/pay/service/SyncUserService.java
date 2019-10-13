package com.ck.pay.service;

import com.ck.pay.dao.AsiaUserDao;
import com.ck.pay.entity.AsiaUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class SyncUserService {

    @Autowired
    private AsiaUserDao asiaUserDao;

    @Transactional
    public void saveUser(List<AsiaUser> asiaUsers) {

        asiaUserDao.saveAll(asiaUsers);
    }
}
