package com.jiudianlianxian.property;

/**
 * 
 * @Title: Book
 * @Description: ʹ��set����ע������
 * @Company: �����ŵ�������Ϣ�������޹�˾
 * @ProjectName: spring_day01
 * @author fupengpeng
 * @date 2017��9��1�� ����4:13:30
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



