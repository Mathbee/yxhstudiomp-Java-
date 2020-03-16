package com.zhanglong.yxhstudiomp.bean;

import java.io.Serializable;

import org.springframework.stereotype.Component;

import lombok.Data;

/**
 * 用户实体类
 */
@Data
@Component
public class UserInfo implements Serializable {

	private static final long serialVersionUID = 1L;
	
	/**
	 * 用户openId，微信小程序自动生成唯一Id
	 */
	private String openId;
	/**
	 * 用户昵称
	 */
	private String nickName;
	/**
	 * 用户的性别，值为1时是男性，值为2时是女性，值为0时是未知
	 */
	private Integer gender;
	/**
	 * 用户所在城市
	 */
	private String city;
	/**
	 * 用户所在省份
	 */
	private String province;
	/**
	 * 用户所在国家
	 */
	private String country;
	/**
	 * 用户头像
	 */
	private String avatarUrl;
	/**
	 * 显示 country，province，city 所用的语言
	 */
	private String language;

}
