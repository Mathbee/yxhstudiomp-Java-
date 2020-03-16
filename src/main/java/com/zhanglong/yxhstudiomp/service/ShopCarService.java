package com.zhanglong.yxhstudiomp.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.zhanglong.yxhstudiomp.bean.ShopCar;

/**
 * 购物车服务层接口
 */
@Service
public interface ShopCarService {

	/**
	 * 根据用户openId查询用户购物车列表
	 */
	List<ShopCar> getShopCarList(String openId);

}
