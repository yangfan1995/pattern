package factory.abstr;

import factory.Milk;
import factory.method.FirstMilkFactory;

/**
 * @author yangfan
 * @description
 * @date 2019/5/2 19:36
 **/

public class AbstractFactory extends AbstractMilkFacroty {
    @Override
    public Milk getFirstMilk() {
        return new FirstMilkFactory().getMilk();
    }
}
