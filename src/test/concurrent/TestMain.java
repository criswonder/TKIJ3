package test.concurrent;

import java.util.Random;

/**
 * Created by hongyun on 16/8/23.
 */
public class TestMain {
    public static AtomicSingleInstance testTarget = null;
    public static void main(String[] args) {
        testSingleInstance();
    }

    private static void testSingleInstance() {
        for (int i = 0; i < 1000; i++) {
            Thread thread = new Thread("fkkk"+i){
                @Override
                public void run() {
                    for (int j = 0; j < 1000; j++) {
                        try {
                            Random random = new Random(1000);
                            int i1 = random.nextInt();
                            Thread.sleep(i1 <0?0:i1);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        super.run();
                        AtomicSingleInstance instance = AtomicSingleInstance.getInstance();

                        if(testTarget==null){
                            testTarget = instance;
                        }else{
                            if(!testTarget.equals(instance)){
                                System.err.println(getName() + ",instance=" + instance);
                                System.err.println(getName() + ",testTarget=" + testTarget);
                            }
                        }
//                        System.out.println(getName() + ",instance=" + instance);
                    }
                }
            };
            thread.start();
        }
    }
}
