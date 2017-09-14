package com.jiudianlianxian.property;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


/**
 * 
 * @Title: TestIoc
 * @Description: 属性注入测试
 * @Company: 济宁九点连线信息技术有限公司
 * @ProjectName: spring_day01
 * @author fupengpeng
 * @date 2017年9月14日 上午10:52:40
 */
public class TestIoc {
	@Test
	public void TestProperty(){
		//1.加载spring配置文件，根据配置文件创建对象
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean1.xml");
		//2.得到配置文件创建的对象
		//使用p名称空间注入对象属性
		Person person = (Person) applicationContext.getBean("person");
		person.test2();
				
	}
			
}
