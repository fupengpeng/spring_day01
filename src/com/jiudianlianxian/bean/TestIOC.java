package com.jiudianlianxian.bean;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.jiudianlianxian.ioc.User;

/**
 * 
 * @Title: TestIOC
 * @Description: ����bean��������ַ�ʽ
 * @Company: �����ŵ�������Ϣ�������޹�˾
 * @ProjectName: spring_day01
 * @author fupengpeng
 * @date 2017��9��1�� ����3:18:51
 */
public class TestIOC {
	@Test
	public void testBean1(){
		// 1.����spring�����ļ������������ļ���������
		ApplicationContext applicationContext = 
				new ClassPathXmlApplicationContext("bean1.xml");
		// 2.�õ������ļ������Ķ���
		Bean1 bean1 = (Bean1) applicationContext.getBean("bean1");
		System.out.println(bean1);
		bean1.add();
	}
	@Test
	public void testBean2(){
		// 1.����spring�����ļ������������ļ���������
		ApplicationContext applicationContext = 
				new ClassPathXmlApplicationContext("bean1.xml");
		// 2.�õ������ļ������Ķ���
		Bean2 bean2 = (Bean2) applicationContext.getBean("bean2");
		System.out.println(bean2);
		bean2.add();
	}
	@Test
	public void testBean3(){
		// 1.����spring�����ļ������������ļ���������
		ApplicationContext applicationContext = 
				new ClassPathXmlApplicationContext("bean1.xml");
		// 2.�õ������ļ������Ķ���
		Bean3 bean3 = (Bean3) applicationContext.getBean("bean3");
		System.out.println(bean3);
		bean3.add();
	}

}
