package com.tmall.wireless;

/**
 * Created by hongyunmhy on 15/9/10
 * 测试修改方法的可见性
 */
public class TestInheritanceChangeMethodVisibility {
	static class A{
		protected void m1(){
			System.out.println("xxxx--a");
		}
	}
	static class B extends A{
		@Override
		public void m1(){
			System.out.println("xxxx--b");
		}
	}

	static class C extends B{
		@Override
		public void m1(){
			System.out.println("xxxx--b");
		}
	}

	public static void main(String args[]){
		B a =new B();
		a.m1();
	}

}
