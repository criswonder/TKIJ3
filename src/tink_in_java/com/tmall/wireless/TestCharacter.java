package com.tmall.wireless;

import java.util.Random;

/**
 * Created by hongyunmhy on 15/10/19.
 */
public class TestCharacter {
	public static void main(String args[]){
		int abc = 'a';
		System.out.println(abc);
		int d = '0';
		char e = 18;
		System.out.println('0');
		System.out.println(d);
		System.out.println(e);

		Random r = new Random();
		String phone = "0";
		for (int i = 1; i < 10; i++)
			phone += Character.forDigit(r.nextInt(10), 10);
		System.out.println(phone);
	}
}
