package com.jiudianlianxian.property;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Properties;

/**
 * 
 * @Title: Person
 * @Description: 使用p名称空间实现属性注入和复杂数据的注入
 * @Company: 济宁九点连线信息技术有限公司
 * @ProjectName: spring_day01
 * @author fupengpeng
 * @date 2017年9月14日 上午11:50:09
 */
public class Person {
	private String pname;
	private String[] arrs;
	private List<String> list;
	private Map<String, String> map;
	private Properties properties;
	public void setArrs(String[] arrs) {
		this.arrs = arrs;
	}
	public void setList(List<String> list) {
		this.list = list;
	}
	public void setMap(Map<String, String> map) {
		this.map = map;
	}
	public void setProperties(Properties properties) {
		this.properties = properties;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public void test2(){
		System.out.println("arrs = " + arrs);
		System.out.println("list = " + list);
		System.out.println("map = " + map);
		System.out.println("properties = " + properties);
	}
	public void test1(){
		System.out.println("pname = " + pname);
	}
}
