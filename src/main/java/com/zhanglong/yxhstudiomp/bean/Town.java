package com.zhanglong.yxhstudiomp.bean;

import java.io.Serializable;

import org.springframework.stereotype.Component;

import lombok.Data;

/**
 * 县区实体类
 */
@Data
@Component
public class Town implements Serializable {

	private static final long serialVersionUID = 1L;

	private Integer id;
	/**
	 * 县区ID
	 */
	private String town_id;
	/**
	 * 县区名称
	 */
	private String town;
	/**
	 * 城市ID
	 */
	private String city_id;

}
