package com.zhanglong.yxhstudiomp.mapper;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.zhanglong.yxhstudiomp.bean.Produce;

/**
 * 商品DAO层接口
 */
@Repository
public interface ProduceMapper {
	/**
	 * 查询商品列表
	 */
	List<Produce> getProduceList();

	/**
	 * 根据商品Id查询单个商品信息
	 */
	Produce getProduceById(Integer pid);

}
