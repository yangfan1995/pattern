package singleton;

import java.lang.reflect.Constructor;

import singleton.lazy.LazySingleton2;

/**
 * @author yangfan
 * @description
 * @date 2019/5/6 23:47
 **/

public class ThreadTest {


    public static void main(String[] args) throws InterruptedException {
        final int testCount = 100000;

//        //test hungry
//        Set<HungrySingleton> hungrySingletonHashSet = new HashSet<>();
//        CountDownLatch countDownLatch1 = new CountDownLatch(testCount);
//        long startTime = System.currentTimeMillis();
//        for (int i = 0; i < testCount; i++) {
//            new Thread(() -> {
//                HungrySingleton hungrySingleton = HungrySingleton.getInstance();
//                hungrySingletonHashSet.add(hungrySingleton);
//                countDownLatch1.countDown();
//            }).run();
//        }
//        countDownLatch1.await();
//        System.out.println("hungry cost : " + (System.currentTimeMillis() - startTime));
//        if (hungrySingletonHashSet.size() == 1) {
//            System.out.println("thread safe");
//        } else {
//            System.out.println("thread unsafe");
//        }
//
//        //test lazy load type 1
//        Set<LazySingleton> lazySingletonHashSet = new HashSet<>();
//        CountDownLatch countDownLatch2 = new CountDownLatch(testCount);
//        long startTime2 = System.currentTimeMillis();
//        for (int i = 0; i < testCount; i++) {
//            new Thread(() -> {
//                LazySingleton lazySingleton = LazySingleton.getInstance();
//                lazySingletonHashSet.add(lazySingleton);
//                countDownLatch2.countDown();
//            }).run();
//        }
//        countDownLatch2.await();
//        System.out.println("lazy cost : " + (System.currentTimeMillis() - startTime2));
//        if (lazySingletonHashSet.size() == 1) {
//            System.out.println("thread safe");
//        } else {
//            System.out.println("thread unsafe");
//        }
//
//
//        //test lazy load type 2
//        Set<LazySingleton2> lazySingletonHashSet2 = new HashSet<>();
//        CountDownLatch countDownLatch3 = new CountDownLatch(testCount);
//        long startTime3 = System.currentTimeMillis();
//        for (int i = 0; i < testCount; i++) {
//            new Thread(() -> {
//                LazySingleton2 lazySingleton = LazySingleton2.getInstance();
//                lazySingletonHashSet2.add(lazySingleton);
//                countDownLatch2.countDown();
//            }).run();
//        }
//        countDownLatch2.await();
//        System.out.println("lazy cost : " + (System.currentTimeMillis() - startTime3));
//        if (lazySingletonHashSet2.size() == 1) {
//            System.out.println("thread safe");
//        } else {
//            System.out.println("thread unsafe");
//        }


        // test reflect singleton
        Class<LazySingleton2> lazySingleton2Class = LazySingleton2.class;
        try {
            Constructor<LazySingleton2> declaredConstructor = lazySingleton2Class.getDeclaredConstructor();
            declaredConstructor.setAccessible(true);
            LazySingleton2 lazySingleton2 = lazySingleton2Class.newInstance();
            System.out.println(lazySingleton2);
        } catch (NoSuchMethodException | InstantiationException | IllegalAccessException e) {
            e.printStackTrace();
        }

    }
}
