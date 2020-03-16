package com.zhanglong.yxhstudiomp.controller;

import java.util.ArrayList;
import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.zhanglong.yxhstudiomp.bean.Address;
import com.zhanglong.yxhstudiomp.service.AddressService;
import com.zhanglong.yxhstudiomp.util.MyReturn;

/**
 * 用户地址控制器
 */
@RestController
public class AddressController {

	@Autowired
	private AddressService addressService;

	/**
	 * 根据用户openId获取用户默认地址
	 */
	@RequestMapping(value = "/getDefaultAddressByOpenId", method = RequestMethod.GET)
	public MyReturn getDefaultAddressByOpenId(String openId) {
		Address address = new Address();
		address.setOpenId(openId);
		address.setIs_default("1");
		HashMap<String, Object> ar = addressService.getDefaultAddressByOpenId(address);
		if (ar != null) {
			return new MyReturn(200, "根据用户查询用户地址", ar);
		} else {
			return new MyReturn(200, "用户地址为空", null);
		}
	}

	/**
	 * 根据用户openId获取用户地址列表
	 */
	@RequestMapping(value = "/getAddressListByOpenId", method = RequestMethod.GET)
	public MyReturn getAddressListByOpenId(String openId) {
		ArrayList<Address> addressList = addressService.getAddressListByOpenId(openId);
		return new MyReturn(200, "根据用户openId获取用户地址", addressList);
	}

}
