package singleton.enumType;

/**
 * @author yangfan
 * @description
 * @date 2019/5/7 23:46
 **/

public enum EnumSingleton {
    INSTANCE;

    public EnumSingleton getInstance() {
        return INSTANCE;
    }
}
