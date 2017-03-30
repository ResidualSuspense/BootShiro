package com.xs.service;

import com.xs.domain.UserInfo;

/**
 * Created by xs on 2017-03-30.
 */
public interface UserInfoService {
    /**通过username查找用户信息;*/
    public UserInfo findByUsername(String username);
}
