package com.zhanglong.yxhstudiomp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSONObject;
import com.zhanglong.yxhstudiomp.bean.UserInfo;
import com.zhanglong.yxhstudiomp.service.UserInfoService;
import com.zhanglong.yxhstudiomp.util.MyReturn;
import com.zhanglong.yxhstudiomp.util.WxmpGetOpenIdUtil;

/**
 * 用户控制器
 */
@RestController
public class UserInfoController {

	@Autowired
	private UserInfoService userinfoService;

	/**
	 * 用codeId后台换取 openId, sessionKey, unionId
	 */
	@RequestMapping(value = "/onLogin", method = RequestMethod.GET)
	public String onLogin(String codeId) {
		JSONObject jsonObj = WxmpGetOpenIdUtil.getOpenId(codeId);
		return (String) jsonObj.get("openid");
	}

	/**
	 * 添加微信用户信息
	 */
	@RequestMapping(value = "/insUserInfo", method = RequestMethod.POST)
	public MyReturn insUserInfo(UserInfo userinfo) {
		UserInfo ui = userinfoService.selUserInfoByOpenId(userinfo);
		if (ui == null) {
			Integer rInteger = userinfoService.insUserInfo(userinfo);
			return new MyReturn(200, "添加用户信息", rInteger);
		} else {
			return new MyReturn(200, "用户信息已存在", null);
		}

	}

}
