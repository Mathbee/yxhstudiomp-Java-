package com.zhanglong.yxhstudiomp.service;

import java.util.ArrayList;
import java.util.HashMap;

import org.springframework.stereotype.Service;

import com.zhanglong.yxhstudiomp.bean.Address;

/**
 * 用户地址服务层接口
 */
@Service
public interface AddressService {
	/**
	 * 根据用户openId获取用户默认地址
	 */
	HashMap<String, Object> getDefaultAddressByOpenId(Address address);

	/**
	 * 根据用户openId获取用户地址列表
	 */
	ArrayList<Address> getAddressListByOpenId(String openId);

}
