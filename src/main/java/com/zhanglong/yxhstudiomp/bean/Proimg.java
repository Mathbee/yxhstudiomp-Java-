package com.zhanglong.yxhstudiomp.bean;

import java.io.Serializable;

import org.springframework.stereotype.Component;

import lombok.Data;

/**
 * 商品图片实体类
 */
@Data
@Component
public class Proimg implements Serializable {
	
	private static final long serialVersionUID = 1L;
	/**
	 * 商品图片ID
	 */
	private Integer piid;
	/**
	 * 商品图片地址
	 */
	private String piimgurl;
	/**
	 * 商品ID
	 */
	private Integer pid;
}
