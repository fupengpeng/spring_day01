package com.jiudianlianxian.property;


/**
 * 
 * @Title: UserService
 * @Description: 与UserDao组成用于注入对象属性的测试
 * @Company: 济宁九点连线信息技术有限公司
 * @ProjectName: spring_day01
 * @author fupengpeng
 * @date 2017年9月14日 上午11:28:26
 */
public class UserService {
	private UserDao userDao;
	private OrderDao orderDao;		
	public void setOrderDao(OrderDao orderDao) {
		this.orderDao = orderDao;
	}
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}
	//在service中得到dao对象，才能调用add方法
	public void add(){
		System.out.println("service... ...");
		userDao.add();
		orderDao.add();
	}
}


