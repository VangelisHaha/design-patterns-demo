package singleton;

/**
 * 枚举方式
 *
 * @author Vangelis
 * @date 2019-07-16 11:10
 */

public class EnumSingleton {
    //    private byte[] data = new byte[2014];
    private EnumSingleton() {
    }
    /**
     *  使用枚举来充当Holder
     */
    private enum EnumHolder {
        /**
         *  实例
         */
        INSTANCE;
        private EnumSingleton instance;
        EnumHolder() {
            this.instance = new EnumSingleton();
        }
        private EnumSingleton getInstance() {
            return this.instance;
        }
    }
    public static EnumSingleton getInstance() {
        return EnumHolder.INSTANCE.getInstance();
    }
}
