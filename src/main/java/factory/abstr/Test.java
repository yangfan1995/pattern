package factory.abstr;

import factory.Milk;

/**
 * @author yangfan
 * @description
 * @date 2019/5/2 19:54
 **/

public class Test {
    public static void main(String[] args) {
        AbstractMilkFacroty abstractMilkFacroty = new AbstractFactory();
        Milk firstMilk = abstractMilkFacroty.getFirstMilk();

        System.out.println(firstMilk.getMilkName());
    }
}
