package com.zhanglong.yxhstudiomp.bean;

import java.io.Serializable;

import org.springframework.stereotype.Component;

import lombok.Data;

/**
 * 购物车实体类
 */
@Data
@Component
public class ShopCar implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 购物车编号
	 */
	private Integer scid;
	/**
	 * 商品ID
	 */
	private Integer pid;
	/**
	 * 购物车商品数量
	 */
	private Integer scnum;
	/**
	 * 购物车价格
	 */
	private Double scprice;
	/**
	 * 用户ID
	 */
	private String openId;
	/**
	 * 购物车状态
	 */
	private Integer scstate;
	/**
	 * 购物车创建时间
	 */
	private String makeCarDate;
	/**
	 * 购物车失效时间
	 */
	private String endCarDate;

}
