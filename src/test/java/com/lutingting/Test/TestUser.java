package com.lutingting.Test;

import java.util.HashMap;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.lutingting.DateUtils;
import com.lutingting.StringUtils;
import com.lutingting.UserUtils;
import com.lutingting.bean.User;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:redis.xml")
public class TestUser {

	@Autowired
	RedisTemplate redisTemplate;
	
	@SuppressWarnings("unchecked")
	@Test
	public void jdkTest() {
		
		long start = System.currentTimeMillis();
		//3.	模拟生成5万条User对象
		for (int i = 1; i <=50000; i++) {
			User user=new User();
			//(1)	ID使用1-5万的顺序号
			user.setId(i);
			//(2)	姓名使用3个随机汉字模拟
			user.setName(StringUtils.getRandomCn(3));
			//(3)	性别在女和男两个值中随机。
			user.setSex(UserUtils.getSex());
			//(4)	手机以13开头+9位随机数模拟
			user.setPhone(UserUtils.getPhone());
			//(5)	邮箱以3-20个随机字母
			user.setEnimal(UserUtils.getMail());
			//(6)	生日要模拟18-70岁之间
			user.setBirth(UserUtils.getBirthday());
			redisTemplate.opsForList().leftPushAll("k1", user);
		}
		long end = System.currentTimeMillis();
		//输出系列化方式、保存数量、所耗时间三项数据
		System.out.println("所耗时间");
		System.out.println("共"+(end-start)+"时间");
		System.out.println("共存5W条数据");
	}
	@SuppressWarnings("unchecked")
	@Test
	public void jsonTest() {
		
		long start = System.currentTimeMillis();
		//3.	模拟生成5万条User对象
		for (int i = 1; i <=50000; i++) {
			User user=new User();
			//(1)	ID使用1-5万的顺序号
			user.setId(i);
			//(2)	姓名使用3个随机汉字模拟
			user.setName(StringUtils.getRandomCn(3));
			//(3)	性别在女和男两个值中随机。
			user.setSex(UserUtils.getSex());
			//(4)	手机以13开头+9位随机数模拟
			user.setPhone(UserUtils.getPhone());
			//(5)	邮箱以3-20个随机字母
			user.setEnimal(UserUtils.getMail());
			//(6)	生日要模拟18-70岁之间
			user.setBirth(UserUtils.getBirthday());
			redisTemplate.opsForList().leftPushAll("k1", user);
		}
		long end = System.currentTimeMillis();
		//输出系列化方式、保存数量、所耗时间三项数据
		System.out.println("所耗时间");
		System.out.println("共"+(end-start)+"时间");
		System.out.println("共存5W条数据");
	}
	
	@SuppressWarnings("unchecked")
	@Test
	public void hashTest() {
		
		long start = System.currentTimeMillis();
		HashMap<String, User> map=new HashMap<String, User>();
		//3.	模拟生成5万条User对象
		for (int i = 1; i <=50000; i++) {
			User user=new User();
			//(1)	ID使用1-5万的顺序号
			user.setId(i);
			//(2)	姓名使用3个随机汉字模拟
			user.setName(StringUtils.getRandomCn(3));
			//(3)	性别在女和男两个值中随机。
			user.setSex(UserUtils.getSex());
			//(4)	手机以13开头+9位随机数模拟
			user.setPhone(UserUtils.getPhone());
			//(5)	邮箱以3-20个随机字母
			user.setEnimal(UserUtils.getMail());
			//(6)	生日要模拟18-70岁之间
			user.setBirth(UserUtils.getBirthday());
			map.put("k1", user);
			redisTemplate.opsForHash().put("k1"+i, "k2"+i, user);
		}
		redisTemplate.opsForHash().putAll("k1", map);
		long end = System.currentTimeMillis();
		//输出系列化方式、保存数量、所耗时间三项数据
		System.out.println("所耗时间");
		System.out.println("共"+(end-start)+"时间");
		System.out.println("共存5W条数据");
	}
}
