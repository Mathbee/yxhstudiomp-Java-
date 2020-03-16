package com.zhanglong.yxhstudiomp.bean;

import java.io.Serializable;

import org.springframework.stereotype.Component;

import lombok.Data;

/**
 * 城市实体类
 */
@Data
@Component
public class City implements Serializable {

	private static final long serialVersionUID = 1L;

	private Integer id;
	/**
	 * 城市ID
	 */
	private String city_id;
	/**
	 * 城市名称
	 */
	private String city;
	/**
	 * 省份ID
	 */
	private String province_id;

}
