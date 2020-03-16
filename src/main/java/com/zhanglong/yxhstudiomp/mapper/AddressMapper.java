package com.zhanglong.yxhstudiomp.mapper;

import java.util.ArrayList;

import com.zhanglong.yxhstudiomp.bean.Address;
import com.zhanglong.yxhstudiomp.bean.City;
import com.zhanglong.yxhstudiomp.bean.Province;
import com.zhanglong.yxhstudiomp.bean.Town;

/**
 * 用户地址DAO层接口
 */
public interface AddressMapper {

	/**
	 * 根据用户openId获取用户默认地址
	 */
	Address getDefaultAddressByOpenId(Address address);

	/**
	 * 根据省份ID获取省份名称
	 */
	Province getProvinceByProvince_id(String province_id);

	/**
	 * 根据城市ID获取城市名称
	 */
	City getCityByCity_id(String city_id);

	/**
	 * 根据县区ID获取县区名称
	 */
	Town getTownByTown_id(String town_id);

	/**
	 * 根据用户openId获取用户地址列表
	 */
	ArrayList<Address> getAddressListByOpenId(String openId);

}
