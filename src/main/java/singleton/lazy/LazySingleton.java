package singleton.lazy;

import java.util.Objects;

/**
 * @author yangfan
 * @description 懒汉式加载单例
 * @date 2019/5/7 0:09
 **/

public class LazySingleton {
    private static LazySingleton lazySingleton;

    private LazySingleton() {
    }

    public static synchronized LazySingleton getInstance() {
        if (Objects.isNull(lazySingleton)) {
            lazySingleton = new LazySingleton();
        }
        return lazySingleton;
    }


}
