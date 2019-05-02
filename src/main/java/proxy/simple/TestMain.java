package proxy.simple;

/**
 * @author yangfan
 * @description
 * @date 2019/4/26 12:30
 **/

public class TestMain {
    public static void main(String[] args) {
        Girl girl = new Girl();
//        girl.doSomething();


        Person person = (Person) new GirlProxy().getInstance(girl);

        person.doSomething();


    }
}
