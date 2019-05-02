package factory.method;

/**
 * @author yangfan
 * @description
 * @date 2019/5/2 19:02
 **/

public class FactoryTest {
    public static void main(String[] args) {
        System.out.println(new FirstMilkFactory().getMilk().getMilkName());
    }
}
