package observer;

/**
 * Observer
 *
 * @author Vangelis
 * @date 2019-06-16 21:29
 */

public interface Observer {
    /**
     *  更新数据，用于给Subject调用
     * @param temperature 温度
     * @param pressure 湿度
     * @param humidity 气压
     */
    void update(float temperature, float pressure, float humidity);
}
