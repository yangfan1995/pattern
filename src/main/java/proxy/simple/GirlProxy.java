package proxy.simple;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author yangfan
 * @description
 * @date 2019/4/26 12:32
 **/

public class GirlProxy implements InvocationHandler {
    private Person person;

    public Object getInstance(Person person) {
        this.person = person;
        Class aClass = person.getClass();
        return Proxy.newProxyInstance(aClass.getClassLoader(), aClass.getInterfaces(), this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        this.person.doSomething();
        return null;
    }
}
