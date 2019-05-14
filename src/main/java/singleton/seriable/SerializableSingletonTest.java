package singleton.seriable;

import java.io.*;

/**
 * @author yangfan
 * @description
 * @date 2019/5/8 0:02
 **/

public class SerializableSingletonTest {
    public static void main(String[] args) {

        SerializableSingleton singleton1;
        SerializableSingleton singleton2 = SerializableSingleton.getInstance();

        //序列化写出

        try {
            FileOutputStream fileOutputStream = new FileOutputStream("serializable.obj");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(singleton2);

            FileInputStream fileInputStream = new FileInputStream("serializable.obj");
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            singleton1 = (SerializableSingleton) objectInputStream.readObject();
            //不是一个对象
            System.out.println(singleton1 == singleton2);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}
