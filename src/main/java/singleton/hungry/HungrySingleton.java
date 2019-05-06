package singleton.hungry;

/**
 * @author yangfan
 * @description
 * @date 2019/5/6 23:44
 **/

public class HungrySingleton {

    private final static HungrySingleton hungrySingleton = new HungrySingleton();

    private HungrySingleton() {
    }

    public static HungrySingleton getInstance() {
        return hungrySingleton;
    }

}
