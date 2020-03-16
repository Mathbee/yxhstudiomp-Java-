package com.zhanglong.yxhstudiomp.mapper;

import org.springframework.stereotype.Repository;

import com.zhanglong.yxhstudiomp.bean.UserInfo;

/**
 * 用户DAO层接口
 */
@Repository
public interface UserInfoMapper {
	/**
	 * 添加微信用户信息
	 */
	Integer insUserInfo(UserInfo userinfo);

	/**
	 * 根据openId查询用户信息
	 */
	UserInfo selUserInfoByOpenId(UserInfo userinfo);

}
