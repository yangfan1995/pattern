package singleton.lazy;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * @author yangfan
 * @description 测试反射侵入单例模式
 * @date 2019/5/7 23:44
 **/

public class LazySingletonReflectTest {

    public static void main(String[] args) {
        // test reflect singleton
        Class<LazySingleton2> lazySingleton2Class = LazySingleton2.class;
        try {
            Constructor<LazySingleton2> declaredConstructor = lazySingleton2Class.getDeclaredConstructor();
            declaredConstructor.setAccessible(true);
            LazySingleton2 lazySingleton2 = declaredConstructor.newInstance();
            System.out.println(lazySingleton2);

            //test reject singleton
//            Constructor<LazySingleton2> declaredConstructor2 = lazySingleton2Class.getDeclaredConstructor();
//            declaredConstructor.setAccessible(true);
//            LazySingleton2 lazySingleton3 = declaredConstructor.newInstance();
//            System.out.println(lazySingleton3);
        } catch (NoSuchMethodException | InstantiationException | IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
        }
    }
}
