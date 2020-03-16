package com.zhanglong.yxhstudiomp.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.zhanglong.yxhstudiomp.bean.ShopCar;
import com.zhanglong.yxhstudiomp.mapper.ShopCarMapper;
import com.zhanglong.yxhstudiomp.service.ShopCarService;

/**
 * 购物车服务层实体类
 */
@Service
@Transactional
public class ShopCarServiceImpl implements ShopCarService {

	@Autowired
	private ShopCarMapper shopCarMapper;

	/**
	 * 根据用户openId查询用户购物车列表
	 */
	@Override
	public List<ShopCar> getShopCarList(String openId) {
		return shopCarMapper.getShopCarList(openId);
	}

}
