package com.jiudianlianxian.property;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


/**
 * 
 * @Title: TestIoc
 * @Description: ����ע�����
 * @Company: �����ŵ�������Ϣ�������޹�˾
 * @ProjectName: spring_day01
 * @author fupengpeng
 * @date 2017��9��14�� ����10:52:40
 */
public class TestIoc {
	@Test
	public void TestProperty(){
		//1.����spring�����ļ������������ļ���������
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean1.xml");
		//2.�õ������ļ������Ķ���
		//ʹ��p���ƿռ�ע���������
		Person person = (Person) applicationContext.getBean("person");
		person.test2();
				
	}
			
}
