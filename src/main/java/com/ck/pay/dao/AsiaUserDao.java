package com.ck.pay.dao;

import com.ck.pay.entity.AsiaUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;

import java.util.Optional;

public interface AsiaUserDao extends JpaRepository<AsiaUser,Long>, QuerydslPredicateExecutor<AsiaUser> {

    Optional<AsiaUser> findById(Long userId);

}
