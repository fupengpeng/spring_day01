package com.jiudianlianxian.bean;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.jiudianlianxian.ioc.User;

/**
 * 
 * @Title: TestIOC
 * @Description: 创建bean对象的三种方式
 * @Company: 济宁九点连线信息技术有限公司
 * @ProjectName: spring_day01
 * @author fupengpeng
 * @date 2017年9月1日 下午3:18:51
 */
public class TestIOC {
	@Test
	public void testBean1(){
		// 1.加载spring配置文件，根据配置文件创建对象
		ApplicationContext applicationContext = 
				new ClassPathXmlApplicationContext("bean1.xml");
		// 2.得到配置文件创建的对象
		Bean1 bean1 = (Bean1) applicationContext.getBean("bean1");
		System.out.println(bean1);
		bean1.add();
	}
	@Test
	public void testBean2(){
		// 1.加载spring配置文件，根据配置文件创建对象
		ApplicationContext applicationContext = 
				new ClassPathXmlApplicationContext("bean1.xml");
		// 2.得到配置文件创建的对象
		Bean2 bean2 = (Bean2) applicationContext.getBean("bean2");
		System.out.println(bean2);
		bean2.add();
	}
	@Test
	public void testBean3(){
		// 1.加载spring配置文件，根据配置文件创建对象
		ApplicationContext applicationContext = 
				new ClassPathXmlApplicationContext("bean1.xml");
		// 2.得到配置文件创建的对象
		Bean3 bean3 = (Bean3) applicationContext.getBean("bean3");
		System.out.println(bean3);
		bean3.add();
	}

}
