package factory.simple;

import factory.Milk;

/**
 * @author yangfan
 * @description
 * @date 2019/5/2 14:28
 **/

public class SimpleFactory {

    public Milk getMilk(String type) {
        if ("firstMilk".equals(type)) {
            return new FirstMilk();
        }
        return null;
    }
}
