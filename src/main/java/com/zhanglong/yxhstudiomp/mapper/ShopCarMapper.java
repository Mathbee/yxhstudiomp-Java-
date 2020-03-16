package com.zhanglong.yxhstudiomp.mapper;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.zhanglong.yxhstudiomp.bean.ShopCar;

/**
 * 购物车DAO层接口
 */
@Repository
public interface ShopCarMapper {

	/**
	 * 根据用户openId查询用户购物车列表
	 */
	List<ShopCar> getShopCarList(String openId);

}
