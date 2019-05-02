package factory.method;

import factory.Milk;
import factory.simple.FirstMilk;

/**
 * @author yangfan
 * @description
 * @date 2019/5/2 19:04
 **/

public class FirstMilkFactory implements MilkFactory {
    @Override
    public Milk getMilk() {
        return new FirstMilk();
    }
}
