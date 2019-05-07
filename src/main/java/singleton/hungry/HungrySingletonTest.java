package singleton.hungry;

import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.CountDownLatch;

/**
 * @author yangfan
 * @description 测试饿汉式单例模式
 * @date 2019/5/7 23:41
 **/

public class HungrySingletonTest {
    public static void main(String[] args) throws InterruptedException {
        final int testCount = 100000;

        //test hungry
        Set<HungrySingleton> hungrySingletonHashSet = new HashSet<>();
        CountDownLatch countDownLatch1 = new CountDownLatch(testCount);
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < testCount; i++) {
            new Thread(() -> {
                HungrySingleton hungrySingleton = HungrySingleton.getInstance();
                hungrySingletonHashSet.add(hungrySingleton);
                countDownLatch1.countDown();
            }).run();
        }
        countDownLatch1.await();
        System.out.println("hungry cost : " + (System.currentTimeMillis() - startTime));
        if (hungrySingletonHashSet.size() == 1) {
            System.out.println("thread safe");
        } else {
            System.out.println("thread unsafe");
        }
    }
}
