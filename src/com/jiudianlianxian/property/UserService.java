package com.jiudianlianxian.property;


/**
 * 
 * @Title: UserService
 * @Description: ��UserDao�������ע��������ԵĲ���
 * @Company: �����ŵ�������Ϣ�������޹�˾
 * @ProjectName: spring_day01
 * @author fupengpeng
 * @date 2017��9��14�� ����11:28:26
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
	//��service�еõ�dao���󣬲��ܵ���add����
	public void add(){
		System.out.println("service... ...");
		userDao.add();
		orderDao.add();
	}
}


