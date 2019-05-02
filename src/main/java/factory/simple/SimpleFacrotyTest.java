package factory.simple;

/**
 * @author yangfan
 * @description
 * @date 2019/5/2 14:29
 **/

public class SimpleFacrotyTest {

    public static void main(String[] args) {
        SimpleFactory simpleFacroty = new SimpleFactory();
        System.out.println(simpleFacroty.getMilk("firstMilk").getMilkName());
    }
}
