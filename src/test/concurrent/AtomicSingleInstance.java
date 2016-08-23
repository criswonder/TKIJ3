package test.concurrent;

import java.util.concurrent.atomic.AtomicReference;

/**
 * Created by hongyun on 16/8/23.
 */
public class AtomicSingleInstance {
    /**单例实现方式一**/
//    public static AtomicSingleInstance me = null;
//    private AtomicSingleInstance(){}
//    public static synchronized AtomicSingleInstance getInstance(){
//        if(me==null){
//            me = new AtomicSingleInstance();
//        }
//        return me;
//    }



    /**单例实现方式二**/
    public static AtomicReference<AtomicSingleInstance> me = new AtomicReference<AtomicSingleInstance>();
    private AtomicSingleInstance(){}
    public static AtomicSingleInstance getInstance(){
        if(me.compareAndSet(null,new AtomicSingleInstance())){
            return me.get();
        }else{
            return me.get();
        }
    }
}
