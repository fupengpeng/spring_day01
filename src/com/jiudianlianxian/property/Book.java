package com.jiudianlianxian.property;

/**
 * 
 * @Title: Book
 * @Description: 使用set方法注入属性
 * @Company: 济宁九点连线信息技术有限公司
 * @ProjectName: spring_day01
 * @author fupengpeng
 * @date 2017年9月1日 下午4:13:30
 */
public class Book {
	private String bookname;
	public void setBookname(String bookname) {
		this.bookname = bookname;
	}
	public void demobook(){
		System.out.println("bookname = " + bookname);
	}	
}



