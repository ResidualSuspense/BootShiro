package com.xs.service.impl;

import com.xs.domain.UserInfo;
import com.xs.repository.UserInfoRepository;
import com.xs.service.UserInfoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by xs on 2017-03-30.
 */
@Service
public class UserInfoServiceImpl implements UserInfoService{
    Logger logger = LoggerFactory.getLogger(this.getClass());


    @Resource
    private UserInfoRepository userInfoRepository;

    @Override
    public UserInfo findByUsername(String username) {
        logger.info("UserInfoServiceImpl.findByUsername()");
        return userInfoRepository.findByUsername(username);
    }
}
