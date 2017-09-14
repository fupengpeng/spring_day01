package com.jiudianlianxian.ioc;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.jiudianlianxian.property.Book;

/**
 * 
 * @Title: TestIoc
 * @Description: ������һ������
 * @Company: �����ŵ�������Ϣ�������޹�˾
 * @ProjectName: spring_day01
 * @author fupengpeng
 * @date 2017��9��1�� ����11:21:00
 */
public class TestIoc {
	@Test
	public void testUser(){
		//1.����spring�����ļ������������ļ���������
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean1.xml");
		//2.�õ������ļ������Ķ���
		User user = (User) applicationContext.getBean("user");
		user.add();
	}
}
