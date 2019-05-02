package proxy.simple;

import lombok.Data;

/**
 * @author yangfan
 * @description
 * @date 2019/4/26 12:27
 **/

@Data
public class Girl implements Person {

    private String name;
    private int sex;

    @Override
    public void doSomething() {
        System.out.println("girl doSomething");
    }
}
