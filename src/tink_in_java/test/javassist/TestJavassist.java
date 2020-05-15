package test.javassist;

import javassist.*;

/**
 * Created by hongyunmhy on 15/12/29.
 */
public class TestJavassist {
    public static void main(String[] args) {
        try {
            ClassPool pool = ClassPool.getDefault();
            pool.insertClassPath("/Users/hongyunmhy/dev/source/tmallandroid_830/tmallandroid/target/classes");
            CtClass cc = null;
            cc = pool.get("com.tmall.wireless.application.TMApplication");
//            CtConstructor constructor = CtNewConstructor.defaultConstructor(cc);
            CtConstructor constructor = cc.getDeclaredConstructor(new CtClass[] {});
            constructor.insertBefore("System.out.println(\"Hello\");");
            cc.writeFile("/Users/hongyunmhy/Desktop/javassitTest");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
