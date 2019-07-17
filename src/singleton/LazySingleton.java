package singleton;

/**
 * 懒汉式
 *
 * @author Vangelis
 * @date 2019-07-16 17:42
 */

public final  class LazySingleton {
    //    private byte[] data = new byte[2014];
    private static LazySingleton instance = null;
    private LazySingleton(){
    }
    public static LazySingleton getInstance() {
        if (instance==null) {
            instance = new LazySingleton();
        }
        return instance;
    }
}
