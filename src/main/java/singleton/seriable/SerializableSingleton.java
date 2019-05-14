package singleton.seriable;

import java.io.ObjectStreamException;
import java.io.Serializable;

/**
 * @author yangfan
 * @description
 * @date 2019/5/7 23:56
 **/

public class SerializableSingleton implements Serializable {
    public final static SerializableSingleton INSTANCE = new SerializableSingleton();

    private SerializableSingleton() {

    }

    public static SerializableSingleton getInstance() {
        return INSTANCE;
    }

    private Object readResolve() throws ObjectStreamException {
        return INSTANCE;
    }
}
