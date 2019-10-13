package com.ck.pay.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Data
@Entity
@Table(name = "asia_user")
@AllArgsConstructor
public class AsiaUser {

    @Id
    private Long id;

    @Column(name = "account")
    private String account;

    @Column(name = "accountName")
    private String accountName;

    @Column(name = "mobilePhone")
    private String mobilePhone;

    @Column(name = "createTime")
    private Date createTime;

    @Column(name = "lastUpdateTime")
    private Date lastUpdateTime;

    public AsiaUser() {
    }
}
