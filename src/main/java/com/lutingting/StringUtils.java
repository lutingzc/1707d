package com.lutingting;

import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

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
	/**
	 * @Title: haveValue 
	 * @Description: 判断是否有值
	 * @param str
	 * @return
	 * @return: boolean
	 */
	public static boolean haveValue(String str) {
		return !(str==null||str.trim().equals(""));
	}
	/**
	 * 
	 * @Title: isMobile 
	 * @Description: 验证手机号码
	 * @return
	 * @return: boolean
	 */
	public static boolean isMobile(String str) {
		String regex="^([0-9]+\\.[0-9]*[1-9][0-9]*)|([0-9]*[1-9][0-9]*\\.[0-9]+)|([0-9]*[1-9][0-9]*)$";
		Pattern p=Pattern.compile(regex);
		Matcher matcher=p.matcher(str);
		return matcher.find();
	}
	/**
	 * 
	 * @Title: isEmail 
	 * @Description: 验证邮件
	 * @param str
	 * @return
	 * @return: boolean
	 */
	public static boolean isEmail(String str) {
		String regex="^\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*$";
		Pattern p=Pattern.compile(regex);
		Matcher matcher=p.matcher(str);
		return matcher.find();
	}
	/**
	 * 
	 * @Title: getRandomStr 
	 * @Description: 字符
	 * @param n
	 * @return
	 * @return: String
	 */
	public static String getRandomStr(int n) {
		StringBuilder sb=new StringBuilder();
		Random random=new Random();
		for (int i = 0; i < n; i++) {
			sb.append((char)'A'+ random.nextInt(26));
		}
		
		return sb.toString();
	}
	/**
	 * 
	 * @Title: getRandonCn 
	 * @Description: 获取随机中文
	 * @return
	 * @return: char
	 */
	private static char getRandonCn() {
		String str="";
		int hightPos;
		int lowPos;
		Random random=new Random();
		hightPos=(176+Math.abs(random.nextInt(39)));
		lowPos=(161+Math.abs(random.nextInt(93)));
		
		byte[] b=new byte[2];
		b[0]=(Integer.valueOf(hightPos)).byteValue();
		b[1]=(Integer.valueOf(lowPos)).byteValue();
		try {
			str=new String(b,"GBK");
			
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("错误");
		}
		return str.charAt(0);
	}
}
