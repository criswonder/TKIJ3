package com.tmall.wireless;

import java.lang.reflect.InvocationTargetException;

import sun.rmi.runtime.Log;

/**
 * Created by hongyunmhy on 15/8/11.
 */
public class TestEnum {
	public static void main(String args[]) throws ClassNotFoundException
	{
//		System.out.println(LoginAction.valueOf("NOTIFY_LOGIN_SUCCESS") == LoginAction.NOTIFY_LOGIN_SUCCESS);

//		B b =new B();
//		b.fk();
		Class B = Class.forName("com.tmall.wireless.B");
		B b =new B();
		A a = new A();
		try {
			B.getSuperclass().getDeclaredMethod("fk").invoke(a);
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			e.printStackTrace();
		}
	}
}

enum LoginAction {

	//登录成功
	NOTIFY_LOGIN_SUCCESS(),
	//登录失败
	NOTIFY_LOGIN_FAILED(),
	//登录取消
	NOTIFY_LOGIN_CANCEL(),
	//打开登录页面
	NOTIFY_USER_LOGIN(),
	//注销成功
	NOTIFY_LOGOUT(),
	//动态打包结果消息
	NOTIFY_LOGINBYKEY_SUCCESS(),
	NOTIFY_LOGINBYKEY_FAILED(),
	NOTIFY_LOGINBYSECURITY(),
	//sso结果
	SHARE_SSOTOKEN(),
	SSO_LOGIN_ACTION(),
	SSO_LOGOUT_ACTION(),
	//nav by scene
	NAV_GETURL_SUCCESS(),
	//绑定支付宝账号结果
	BIND_ALIPAY_SUCCESS(),
	BIND_ALIPAY_FAILED(),
	//refreshCookies
	NOTIFY_REFRESH_COOKIES,
	NOTIFY_RESET_STATUS;
}

class A {
	public void fk()
	{
		System.out.println("fk in A");
	}
}

  class B extends A{
	@Override
	public void fk(){
		super.fk();
		System.out.println("fk in B");
	}
}