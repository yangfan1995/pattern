package singleton.seriable;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 * @author yangfan
 * @description
 * @date 2019/5/8 0:02
 **/

public class SerializableSingletonTest {
    public static void main(String[] args) {

        SerializableSingleton singleton1 = null;
        SerializableSingleton singleton2 = SerializableSingleton.getInstance();

        //序列化写出

        try {
            FileOutputStream fileOutputStream = new FileOutputStream("serializable.obj");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
//            objectOutputStream.write(singleton2.);
//            o

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
