package com.zhanglong.yxhstudiomp.bean;

import java.io.Serializable;

import org.springframework.stereotype.Component;

import lombok.Data;

/**
 * 用户地址实体类
 */
@Data
@Component
public class Address implements Serializable {

	private static final long serialVersionUID = 1L;
	private Integer aid;
	/**
	 * 用户openId
	 */
	private String openId;
	/**
	 * 省份ID
	 */
	private String province_id;
	/**
	 * 城市ID
	 */
	private String city_id;
	/**
	 * 县区ID
	 */
	private String town_id;
	/**
	 * 手机
	 */
	private String mobile;
	/**
	 * 详细地址
	 */
	private String address;
	/**
	 * 联系人
	 */
	private String contact;
	/**
	 * 别名
	 */
	private String alias;
	/**
	 * 是否是默认
	 */
	private String is_default;
	/**
	 * 备注
	 */
	private String remark;

}
