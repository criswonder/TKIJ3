package com.hongyun.annotation;

import java.lang.annotation.*;

public class AnnotationTest{
    public static void main(String[] args) {

    }

    class A{}
    class B{}
    public void testGeneric(){
        GenericType<A> genericType=new GenericType<>(A.class);
        System.out.println("------------");
        System.out.println(genericType.isInstance(new A()));
        System.out.println(genericType.isInstance(new B()));
    }

    @Documented
    @Retention(RetentionPolicy.RUNTIME)
    @Target(value = {ElementType.FIELD, ElementType.METHOD})
    public @interface UseCase {
        public int id();

        public String description() default "default value";
    }

    /**
     * 泛型类型判断封装类
     *
     * @param <T>
     */
    class GenericType<T> {
        Class<?> classType;

        public GenericType(Class<?> type) {
            classType = type;
        }

        public boolean isInstance(Object object) {
            return classType.isInstance(object);
        }
    }

    public <V, K> V put(K key, V value) {
        Object obj = null;
        return (V) obj;
    }
}
