package test.generic;

/**
 * Created by hongyun on 16/8/18.
 */
public class TestGeneric {
    public static void main(String[] args) {
        findIt();

    }

    public static <F> Generic<F> findIt(){
        Generic<Integer> obj = new Generic<Integer>();
        Object a = obj.create();
        return null;
    }

    static class Generic<T> {
        public T create(){
            Object obj = new Object();
            return (T )obj;
        }
    }
}
