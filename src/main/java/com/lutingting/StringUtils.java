package com.lutingting;
/**
 * 
 * @ClassName: 判断一个字符串是否为空 
 * @Description: TODO
 * @author:lq 
 * @date: 2019年11月7日 下午7:09:26
 */
public class StringUtils {

	public static boolean isBlank(String str) {
		return (str==null||str.trim().equals(""));
	}
	
}
