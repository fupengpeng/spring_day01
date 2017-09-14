package com.jiudianlianxian.ioc;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.jiudianlianxian.property.Book;

/**
 * 
 * @Title: TestIoc
 * @Description: 给此类一个描述
 * @Company: 济宁九点连线信息技术有限公司
 * @ProjectName: spring_day01
 * @author fupengpeng
 * @date 2017年9月1日 上午11:21:00
 */
public class TestIoc {
	@Test
	public void testUser(){
		//1.加载spring配置文件，根据配置文件创建对象
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean1.xml");
		//2.得到配置文件创建的对象
		User user = (User) applicationContext.getBean("user");
		user.add();
	}
}
