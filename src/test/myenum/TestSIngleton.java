package test.myenum;

import java.util.ArrayList;
import java.util.Collections;


public class TestSIngleton {
	private  ArrayList<TMShareStatusListener> mListeners;
	private TestSIngleton(){
		
	}
	private static TestSIngleton me;
	
	public synchronized static TestSIngleton getInstance(){
		if(me==null){
			me = new TestSIngleton();
			me.mListeners = (ArrayList<TMShareStatusListener>) Collections.synchronizedList(new ArrayList<TMShareStatusListener>());
		}
		return me;
	}

}
