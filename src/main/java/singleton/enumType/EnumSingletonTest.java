package singleton.enumType;

import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.CountDownLatch;

/**
 * @author yangfan
 * @description
 * @date 2019/5/7 23:49
 **/

public class EnumSingletonTest {
    public static void main(String[] args) throws InterruptedException {
        final int testCount = 100000;
        //test enum singleton
        Set<EnumSingleton> enumSingletonHashSet = new HashSet<>();
        CountDownLatch countDownLatch1 = new CountDownLatch(testCount);
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < testCount; i++) {
            new Thread(() -> {
                EnumSingleton enumSingleton = EnumSingleton.INSTANCE.getInstance();
                enumSingletonHashSet.add(enumSingleton);
                countDownLatch1.countDown();
            }).run();
        }
        countDownLatch1.await();
        System.out.println("hungry cost : " + (System.currentTimeMillis() - startTime));
        if (enumSingletonHashSet.size() == 1) {
            System.out.println("thread safe");
        } else {
            System.out.println("thread unsafe");
        }
    }
}
