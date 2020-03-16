package com.zhanglong.yxhstudiomp.util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.URL;
import java.net.URLConnection;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

public class WxmpGetOpenIdUtil {
	/**
	 * 根据code换取openId 本接口应在后端服务器调用
	 */
	private final static String CODE_URL = "https://api.weixin.qq.com/sns/jscode2session?appid=";

	private final static String APP_ID = "wx208da25e78289c61";

	private final static String SECRET = "601c8a61003d54d11e70b2443cea829c";

	public static JSONObject getOpenId(String codeId) {
		String url = CODE_URL + APP_ID + "&secret=" + SECRET + "&js_code=" + codeId + "&grant_type=authorization_code";
		PrintWriter out = null;
		BufferedReader in = null;
		String line;
		StringBuffer stringBuffer = new StringBuffer();
		try {
			URL realUrl = new URL(url);
			// 打开和URL之间的连接
			URLConnection conn = realUrl.openConnection();
			// 设置通用的请求属性 设置请求格式
			// 设置返回类型
			conn.setRequestProperty("contentType", "text/plain");
			// 设置请求类型
			conn.setRequestProperty("content-type", "application/x-www-form-urlencoded");
			// 设置超时时间
			conn.setConnectTimeout(5000);
			conn.setReadTimeout(5000);
			conn.setDoOutput(true);
			conn.connect();
			// 获取URLConnection对象对应的输出流
			out = new PrintWriter(conn.getOutputStream());
			// flush输出流的缓冲
			out.flush();
			// 定义BufferedReader输入流来读取URL的响应 设置接收格式
			in = new BufferedReader(new InputStreamReader(conn.getInputStream(), "UTF-8"));
			while ((line = in.readLine()) != null) {
				stringBuffer.append(line);
			}
			JSONObject jsonObj = JSON.parseObject(stringBuffer.toString());
			return jsonObj;
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			// 使用finally块来关闭输出流、输入流
			try {
				if (out != null) {
					out.close();
				}
				if (in != null) {
					in.close();
				}
			} catch (IOException ex) {
				ex.printStackTrace();
			}
		}
		return null;
	}
}
