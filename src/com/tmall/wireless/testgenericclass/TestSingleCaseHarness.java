package com.tmall.wireless.testgenericclass;

import java.util.LinkedHashMap;

/**
 * Created by hongyunmhy on 15/8/13.
 */
public class TestSingleCaseHarness {
	public static void main(String args[]){
//		testMapToString2JsonObjToString();
		testStringFormat();
	}

	private static void testMapToString2JsonObjToString()
	{
		LinkedHashMap map = new LinkedHashMap();
		map.put("key1",new String("xxxx"));
		map.put("key2",new String("xxxx"));
		map.put("key3",new String("xxxx"));

		System.out.println(map);
	}

	private static void testStringFormat()
	{
		float f1 = 2.33f;
		System.out.printf("一本书的价格是：%2.2f元%n", 49.8);
		System.out.println(String.format("%f和 % .3f xx", 99.45,900.223));
//		System.out.println(String.format("%1$d,%2$s", 99,"abc"));
	}
}
