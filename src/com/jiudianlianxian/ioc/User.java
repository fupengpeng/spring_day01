package com.jiudianlianxian.ioc;


/**
 * 
 * @Title: User
 * @Description: ������һ������
 * @Company: �����ŵ�������Ϣ�������޹�˾
 * @ProjectName: spring_day01
 * @author fupengpeng
 * @date 2017��9��1�� ����11:11:00
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
