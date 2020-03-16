package com.zhanglong.yxhstudiomp.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.zhanglong.yxhstudiomp.bean.UserInfo;
import com.zhanglong.yxhstudiomp.mapper.UserInfoMapper;
import com.zhanglong.yxhstudiomp.service.UserInfoService;

/**
 * 用户服务层实体类
 */
@Service
@Transactional
public class UserInfoServiceImpl implements UserInfoService {

	@Autowired
	private UserInfoMapper userinfoMapper;

	/**
	 * 添加微信用户信息
	 */
	@Override
	public Integer insUserInfo(UserInfo userinfo) {
		return userinfoMapper.insUserInfo(userinfo);
	}

	/**
	 * 根据openId查询用户信息
	 */
	@Override
	public UserInfo selUserInfoByOpenId(UserInfo userinfo) {
		return userinfoMapper.selUserInfoByOpenId(userinfo);
	}

}
