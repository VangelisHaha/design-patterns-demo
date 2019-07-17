package singleton;

import java.io.IOException;
import java.net.Socket;
import java.nio.channels.SocketChannel;

/**
 * 懒汉式+同步方法+Double-Check
 *
 * @author Vangelis
 * @date 2019-07-16 17:42
 */

public final class DoubleCheckLazySingleton {
    //    private byte[] data = new byte[2014];
    private static DoubleCheckLazySingleton instance = null;
    SocketChannel socketChannel;
    Socket socket;
    private DoubleCheckLazySingleton() throws IOException {
        // 初始化
        this.socketChannel = SocketChannel.open();
        this.socket = new Socket();
    }
    public  static DoubleCheckLazySingleton getInstance() throws IOException {
        if (null==instance) {
            synchronized (DoubleCheckLazySingleton.class) {
                if (null==instance) {
                    instance = new DoubleCheckLazySingleton();
                }
            }
        }
        return instance;
    }
}
