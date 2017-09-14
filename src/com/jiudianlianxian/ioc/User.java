package com.jiudianlianxian.ioc;


/**
 * 
 * @Title: User
 * @Description: 给此类一个描述
 * @Company: 济宁九点连线信息技术有限公司
 * @ProjectName: spring_day01
 * @author fupengpeng
 * @date 2017年9月1日 上午11:11:00
 */
public class User {

	public void add(){
		System.out.println("add");
	}
	public static void main(String[] args) {
		User user = new User();
		user.add();
		
	}
	
}
