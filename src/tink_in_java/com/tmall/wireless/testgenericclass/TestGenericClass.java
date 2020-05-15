package com.tmall.wireless.testgenericclass;

/**
 * Created by hongyunmhy on 15/7/17.
 */
public class TestGenericClass {
	public <T extends IPacelable> T getPacelableIntent(){
		return (T)new PacelableImpB();
	}

	public static void main(String args[]){
		TestGenericClass testGenericClass = new TestGenericClass();

		PacelableImp imp  =testGenericClass.getPacelableIntent();

//		if(imp instanceof PacelableImp){
//			PacelableImp aImp = (PacelableImp)imp;
//			aImp.methodA();
//			aImp.methodB();
//		}else {
//			PacelableImpB aImp = (PacelableImpB)imp;
//			aImp.methodA();
//			aImp.methodB();
//		}
//		imp.methodA();
//		imp.methodB();
	}
}
