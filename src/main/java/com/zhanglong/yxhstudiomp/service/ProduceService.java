package com.zhanglong.yxhstudiomp.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.zhanglong.yxhstudiomp.bean.Produce;

/**
 * 商品服务层接口
 */
@Service
public interface ProduceService {

	/**
	 * 查询商品列表
	 */
	List<Produce> getProduceList();

	/**
	 * 根据商品Id查询单个商品信息
	 */
	Produce getProduceById(Integer pid);

}
