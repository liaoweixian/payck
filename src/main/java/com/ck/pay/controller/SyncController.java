package com.ck.pay.controller;

import com.ck.pay.dto.CommonRes;
import com.ck.pay.entity.AsiaUser;
import com.ck.pay.service.SyncUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("/sync")
public class SyncController {

    @Autowired
    private SyncUserService syncUserService;

    /**
     * 保存同步过来的用户信息
     * @param asiaUser
     * @return
     */
    @PostMapping("/syncAsiaUser")
    @ResponseBody
    public CommonRes<Object> syncAsiaUser(@RequestBody List<AsiaUser> asiaUser) {

        if (CollectionUtils.isEmpty(asiaUser))
        {
            return new CommonRes<Object>(201, "操作失败", null);
        }
        syncUserService.saveUser(asiaUser);
        return CommonRes.data();
    }

}
