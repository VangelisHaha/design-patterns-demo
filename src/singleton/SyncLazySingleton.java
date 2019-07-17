package singleton;

/**
 * 懒汉式+同步方法
 *
 * @author 王杰
 * @date 2019-07-16 17:42
 */

public final class SyncLazySingleton {
    //    private byte[] data = new byte[2014];
    private static SyncLazySingleton instance = null;
    private SyncLazySingleton(){
    }
    public  static  SyncLazySingleton getInstance() {
        if (instance==null) {
            instance = new SyncLazySingleton();
        }
        return instance;
    }
}
