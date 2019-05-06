package singleton.lazy;

/**
 * @author yangfan
 * @description 懒汉式加载单例
 * @date 2019/5/7 0:09
 **/

public class LazySingleton2 {
    //默认会初始化内部类，如果没使用的话，内部类是不加载的，为了防止反射侵入
    private static LazySingleton2 lazySingleton;

    private static boolean initialised = false;

    private LazySingleton2() {
        synchronized (LazyHolder.class) {
            if (!initialised) {
                initialised = true;
            } else {
                throw new RuntimeException("单例被侵犯");
            }
        }
    }

    public static LazySingleton2 getInstance() {
        return LazyHolder.LAZY_SINGLETON;
    }

    private static class LazyHolder {
        private static final LazySingleton2 LAZY_SINGLETON = new LazySingleton2();
    }


}
