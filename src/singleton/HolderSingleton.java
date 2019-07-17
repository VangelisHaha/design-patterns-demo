package singleton;

/**
 * Holder方式
 *
 * @author Vangelis
 * @date 2019-07-16 17:42
 */

public final class HolderSingleton {
    //    private byte[] data = new byte[2014];
    private HolderSingleton()  {
        // 初始化
    }
    private static class Holder {
        private static HolderSingleton instance = new HolderSingleton();
    }
    public  static HolderSingleton getInstance() {
        return Holder.instance;
    }
}
