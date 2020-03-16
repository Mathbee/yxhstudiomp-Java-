package com.zhanglong.yxhstudiomp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.zhanglong.yxhstudiomp.bean.Produce;
import com.zhanglong.yxhstudiomp.service.ProduceService;
import com.zhanglong.yxhstudiomp.util.MyReturn;

/**
 * 商品控制器
 */
@RestController
public class ProduceController {

	@Autowired
	private ProduceService produceService;

	/**
	 * 查询商品列表
	 */
	@RequestMapping(value = "getProduceList", method = RequestMethod.GET)
	public MyReturn getProduceList() {
		List<Produce> produceList = produceService.getProduceList();
		return new MyReturn(200, "查询商品列表", produceList);
	}

	/**
	 * 根据商品Id查询单个商品信息
	 */
	@RequestMapping(value = "getProduceById", method = RequestMethod.GET)
	public MyReturn getProduce(Integer pid) {
		Produce produce = produceService.getProduceById(pid);
		return new MyReturn(200, "查询商品信息", produce);
	}

}
