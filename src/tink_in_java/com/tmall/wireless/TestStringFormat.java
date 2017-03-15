package com.tmall.wireless;

import java.util.Calendar;
import java.util.Date;

/**
 * Created by hongyunmhy on 15/9/25.
 */
public class TestStringFormat {
	public static void main(String ags[]) throws ClassNotFoundException {
//		System.out.println(String.format(" time is %d"+TestStringFormat.class.getSimpleName(),System.currentTimeMillis()));
//		System.out.println(Integer.toHexString(6177));
		int x = Integer.parseInt("a821", 16);
		System.out.println(x);
		System.out.println(Integer.toHexString(x));
		boolean aa = false && false;
		System.out.println(aa);

		System.out.println(System.currentTimeMillis());

		String date = new java.text.SimpleDateFormat("dd/MM/yyyy HH:mm:ss").format(Calendar.getInstance().getTime());
		System.out.println(date);

		Calendar.getInstance().clear();
		Calendar c1 = Calendar.getInstance();
		c1.set(2015, 10, 11, 23, 59, 59);
		System.out.println(c1.getTimeInMillis());
		String date2 = new java.text.SimpleDateFormat("dd/MM/yyyy HH:mm:ss").format(c1.getTime());
		System.out.println(date2);

		System.out.println("==========");
		Calendar.getInstance().clear();
		Calendar c2 = Calendar.getInstance();
		c2.set(2015, 9, 15, 16, 46, 59);
		System.out.println(c2.getTimeInMillis());
		String date3 = new java.text.SimpleDateFormat("dd/MM/yyyy HH:mm:ss").format(c2.getTime());
		System.out.println(date3);


		String prefix = "abc://";
		System.out.println("abc://123".substring(prefix.length()+1));
	}

}
