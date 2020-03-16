package com.zhanglong.yxhstudiomp.service;

import org.springframework.stereotype.Service;

import com.zhanglong.yxhstudiomp.bean.UserInfo;

/**
 * 用户服务层接口
 */
@Service
public interface UserInfoService {

	/**
	 * 添加微信用户信息
	 */
	Integer insUserInfo(UserInfo userinfo);

	/**
	 * 根据openId查询用户信息
	 */
	UserInfo selUserInfoByOpenId(UserInfo userinfo);

}
