package com.zhanglong.yxhstudiomp.mapper;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.zhanglong.yxhstudiomp.bean.Proimg;

/**
 * 商品图片DAO接口
 */
@Repository
public interface ProimgMapper {

	/**
	 * 根据商品Id查询商品图片
	 */
	List<Proimg> getProimgListByPid(Integer pid);

}
