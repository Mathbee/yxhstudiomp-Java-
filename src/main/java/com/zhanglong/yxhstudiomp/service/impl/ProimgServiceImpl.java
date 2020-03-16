package com.zhanglong.yxhstudiomp.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.zhanglong.yxhstudiomp.bean.Proimg;
import com.zhanglong.yxhstudiomp.mapper.ProimgMapper;
import com.zhanglong.yxhstudiomp.service.ProimgService;

/**
 * 商品图片服务层实体类
 */
@Service
@Transactional
public class ProimgServiceImpl implements ProimgService {

	@Autowired
	private ProimgMapper proimgMapper;

	/**
	 * 根据商品Id查询商品图片
	 */
	@Override
	public List<Proimg> getProimgListByPid(Integer pid) {
		return proimgMapper.getProimgListByPid(pid);
	}

}
