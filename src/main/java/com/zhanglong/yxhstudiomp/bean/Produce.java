package com.zhanglong.yxhstudiomp.bean;

import java.io.Serializable;

import org.springframework.stereotype.Component;

import lombok.Data;

/**
 * 商品实体类
 */
@Data
@Component
public class Produce implements Serializable {

	private static final long serialVersionUID = 1L;
	/**
	 * 商品ID
	 */
	private Integer pid;
	/**
	 * 商品名称
	 */
	private String pname;
	/**
	 * 商品价格
	 */
	private Double pprice;
	/**
	 * 商品图片地址
	 */
	private String pimgurl;
	/**
	 * 商品描述
	 */
	private String pdesc;
	/**
	 * 商品备注
	 */
	private String premark;
	private Integer pattention;

}
