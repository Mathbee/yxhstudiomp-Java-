package com.zhanglong.yxhstudiomp.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.zhanglong.yxhstudiomp.bean.Proimg;
/**
 * 商品图片服务层接口
 */
@Service
public interface ProimgService {
	/**
	 * 根据商品Id查询商品图片
	 */
	public List<Proimg> getProimgListByPid(Integer pid);

}
