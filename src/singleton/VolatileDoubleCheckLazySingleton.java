package singleton;

import java.io.IOException;
import java.net.Socket;
import java.nio.channels.SocketChannel;

/**
 * 懒汉式+同步方法+Double-Check+Volatile
 *
 * @author Vangelis
 * @date 2019-07-16 17:42
 */

public final class VolatileDoubleCheckLazySingleton {
    //    private byte[] data = new byte[2014];
    private volatile static VolatileDoubleCheckLazySingleton instance = null;
    SocketChannel socketChannel;
    Socket socket;
    private VolatileDoubleCheckLazySingleton() throws IOException {
        // 初始化
        this.socketChannel = SocketChannel.open();
        this.socket = new Socket();
    }
    public  static VolatileDoubleCheckLazySingleton getInstance() throws IOException {
        if (null==instance) {
            synchronized (VolatileDoubleCheckLazySingleton.class) {
                if (null==instance) {
                    instance = new VolatileDoubleCheckLazySingleton();
                }
            }
        }
        return instance;
    }
}
