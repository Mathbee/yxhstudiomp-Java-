package com.zhanglong.yxhstudiomp.bean;

import java.io.Serializable;

import org.springframework.stereotype.Component;

import lombok.Data;

/**
 * 省份实体类
 */
@Data
@Component
public class Province implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	/**
	 * 序号
	 */
	private Integer id;
	/**
	 * 省份ID
	 */
	private String province_id;
	/**
	 * 省份名称
	 */
	private String province;

}
