package com.tmall.wireless.testgenericclass;

/**
 * Created by hongyunmhy on 15/7/30.
 */
public class TestNPE {
	public static void main(String[] args){
		A a =new A();
		a.b = new B();
		a.b.mString = "";

		if(a!=null && a.b!=null && a.b.mString!=null && a.b.mString.length()>0){
			System.out.println("11fk!!!!");
		}else {
			System.out.println("fk!!!!");
		}
	}

	static class A{
		public B b;
	}

	static class B{
		public String mString;
	}
}
