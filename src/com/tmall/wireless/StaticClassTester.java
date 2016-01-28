package com.tmall.wireless;

/**
 * Created by hongyunmhy on 15/6/24.
 */
public class StaticClassTester {
    private static InnerStatic clz = new InnerStatic();
    public static class InnerStatic{
        public InnerStatic(){
            System.out.print("InnerStatic init!!!!");
        }
    }
}
