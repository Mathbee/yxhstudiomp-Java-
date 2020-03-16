package com.zhanglong.yxhstudiomp.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.zhanglong.yxhstudiomp.bean.Produce;
import com.zhanglong.yxhstudiomp.mapper.ProduceMapper;
import com.zhanglong.yxhstudiomp.service.ProduceService;

/**
 * 商品服务层实现类
 */
@Service
@Transactional
public class ProduceServiceImpl implements ProduceService {

	@Autowired
	private ProduceMapper produceMapper;

	/**
	 * 查询商品列表
	 */
	@Override
	public List<Produce> getProduceList() {
		return produceMapper.getProduceList();
	}

	/**
	 * 根据商品Id查询单个商品信息
	 */
	@Override
	public Produce getProduceById(Integer pid) {
		return produceMapper.getProduceById(pid);
	}

}
