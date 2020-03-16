package com.zhanglong.yxhstudiomp.service.impl;

import java.util.ArrayList;
import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.zhanglong.yxhstudiomp.bean.Address;
import com.zhanglong.yxhstudiomp.bean.City;
import com.zhanglong.yxhstudiomp.bean.Province;
import com.zhanglong.yxhstudiomp.bean.Town;
import com.zhanglong.yxhstudiomp.mapper.AddressMapper;
import com.zhanglong.yxhstudiomp.service.AddressService;

/**
 * 用户地址服务层实现类
 */
@Service
@Transactional
public class AddressServiceImpl implements AddressService {

	@Autowired
	private AddressMapper addressMapper;

	/**
	 * 根据用户openId获取用户默认地址
	 */
	@Override
	public HashMap<String, Object> getDefaultAddressByOpenId(Address address) {
		Address ar = addressMapper.getDefaultAddressByOpenId(address);
		if (ar != null) {
			Province province = addressMapper.getProvinceByProvince_id(ar.getProvince_id());
			City city = addressMapper.getCityByCity_id(ar.getCity_id());
			Town town = addressMapper.getTownByTown_id(ar.getTown_id());
			HashMap<String, Object> hashMap = new HashMap<String, Object>();
			hashMap.put("Address", ar);
			hashMap.put("Province", province);
			hashMap.put("City", city);
			hashMap.put("Town", town);
			return hashMap;
		} else {
			return null;
		}
	}

	/**
	 * 根据用户openId获取用户地址列表
	 */
	@Override
	public ArrayList<Address> getAddressListByOpenId(String openId) {
		return addressMapper.getAddressListByOpenId(openId);
	}

}
