package factory.simple;

import factory.Milk;
import lombok.Data;

/**
 * @author yangfan
 * @description
 * @date 2019/5/2 14:25
 **/

@Data
public class FirstMilk implements Milk {

    private String name = "firstName";

    @Override
    public String getMilkName() {
        return name;
    }
}
