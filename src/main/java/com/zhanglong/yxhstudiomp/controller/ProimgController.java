package com.zhanglong.yxhstudiomp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.zhanglong.yxhstudiomp.bean.Proimg;
import com.zhanglong.yxhstudiomp.service.ProimgService;
import com.zhanglong.yxhstudiomp.util.MyReturn;

/**
 * 商品图片控制器
 */
@RestController
public class ProimgController {

	@Autowired
	private ProimgService proimgService;

	/**
	 * 根据商品Id查询商品图片
	 */
	@RequestMapping(value = "/getProimgListByPid", method = RequestMethod.GET)
	public MyReturn getProimgListByPid(Integer pid) {
		List<Proimg> proimgList = proimgService.getProimgListByPid(pid);
		return new MyReturn(200, "根据商品ID查询商品图片", proimgList);
	}

}
