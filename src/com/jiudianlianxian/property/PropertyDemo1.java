package com.jiudianlianxian.property;



/**
 * 
 * @Title: PropertyDemo1
 * @Description: 属性注入
 * @Company: 济宁九点连线信息技术有限公司
 * @ProjectName: spring_day01
 * @author fupengpeng
 * @date 2017年9月1日 下午4:04:41
 */
public class PropertyDemo1 {
	private String username;
	public PropertyDemo1(String username) {
		this.username = username;
	}
	public void test1(){
		System.out.println("demo.username = " + username);
	}
}



