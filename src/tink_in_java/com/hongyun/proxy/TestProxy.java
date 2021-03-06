package com.hongyun.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

//https://www.jianshu.com/p/9bcac608c714
public class TestProxy {
    public static void main(String[] args) {
        System.out.println("proxy:");

        System.getProperties().setProperty("sun.misc.ProxyGenerator.saveGeneratedFiles", "true");

        HelloInterface hello = new Hello();

        InvocationHandler handler = new ProxyHandler(hello);

        HelloInterface proxyHello = (HelloInterface) Proxy.newProxyInstance(
                hello.getClass().getClassLoader(),
                hello.getClass().getInterfaces(),
                handler);

        proxyHello.sayHello();
    }
}
