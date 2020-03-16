package com.zhanglong.yxhstudiomp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.zhanglong.yxhstudiomp.bean.ShopCar;
import com.zhanglong.yxhstudiomp.service.ShopCarService;
import com.zhanglong.yxhstudiomp.util.MyReturn;

/**
 * 购物车控制器
 */
@RestController
public class ShopCarController {

	@Autowired
	private ShopCarService shopCarService;

	/**
	 * 根据用户openId查询用户购物车列表
	 */
	public MyReturn getShopCarList(String openId) {
		List<ShopCar> shopCarList = shopCarService.getShopCarList(openId);
		return new MyReturn(200, "根据用户openId查询用户购物车列表", shopCarList);
	}

}
