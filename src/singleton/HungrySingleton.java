package singleton;

/**
 * 饿汉式单例
 *
 * @author Vangelis
 * @date 2019-07-16 17:25
 */
public final class HungrySingleton {
//    private byte[] data = new byte[2014];
    private static HungrySingleton instance = new HungrySingleton();

    /**
     *  私有构造
     */
    private HungrySingleton() {

    }
    public static HungrySingleton getInstance() {
        return instance;
    }
}
