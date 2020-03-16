package com.zhanglong.yxhstudiomp.util;

import java.util.HashMap;

@SuppressWarnings("rawtypes")
public class MyReturn extends HashMap {

	private static final long serialVersionUID = 1L;

	@SuppressWarnings("unchecked")
	public MyReturn(Integer code, String msg, Object data) {
		this.put("code", code);
		this.put("msg", msg);
		this.put("data", data);
	}

}
