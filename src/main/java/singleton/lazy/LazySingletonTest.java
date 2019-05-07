package singleton.lazy;

import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.CountDownLatch;

/**
 * @author yangfan
 * @description
 * @date 2019/5/7 23:42
 **/

public class LazySingletonTest {


    public static void main(String[] args) throws InterruptedException {
        final int testCount = 100000;
        //test lazy load type 1
        Set<LazySingleton> lazySingletonHashSet = new HashSet<>();
        CountDownLatch countDownLatch2 = new CountDownLatch(testCount);
        long startTime2 = System.currentTimeMillis();
        for (int i = 0; i < testCount; i++) {
            new Thread(() -> {
                LazySingleton lazySingleton = LazySingleton.getInstance();
                lazySingletonHashSet.add(lazySingleton);
                countDownLatch2.countDown();
            }).run();
        }
        countDownLatch2.await();
        System.out.println("lazy cost : " + (System.currentTimeMillis() - startTime2));
        if (lazySingletonHashSet.size() == 1) {
            System.out.println("thread safe");
        } else {
            System.out.println("thread unsafe");
        }


        //test lazy load type 2
        Set<LazySingleton2> lazySingletonHashSet2 = new HashSet<>();
        CountDownLatch countDownLatch3 = new CountDownLatch(testCount);
        long startTime3 = System.currentTimeMillis();
        for (int i = 0; i < testCount; i++) {
            new Thread(() -> {
                LazySingleton2 lazySingleton = LazySingleton2.getInstance();
                lazySingletonHashSet2.add(lazySingleton);
                countDownLatch2.countDown();
            }).run();
        }
        countDownLatch2.await();
        System.out.println("lazy cost : " + (System.currentTimeMillis() - startTime3));
        if (lazySingletonHashSet2.size() == 1) {
            System.out.println("thread safe");
        } else {
            System.out.println("thread unsafe");
        }
    }
}
