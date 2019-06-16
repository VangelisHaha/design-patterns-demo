package observer.bad;

/**
 * 面板类
 *
 * @author Vangelis
 * @date 2019-06-16 20:50
 */
public class CurrentConditions {
    /**
     * 温度
     */
    private float temperature;
    /**
     *  湿度
     */
    private float pressure;
    /**
     *  气压
     */
    private float humidity;

    /**
     *  更新本地
     * @param temperature 温度
     * @param pressure 湿度
     * @param humidity 气压
     */
    public void update(float temperature, float pressure, float humidity) {
        this.temperature = temperature;
        this.pressure = pressure;
        this.humidity = humidity;
        display();
    }
    /**
     *  显示
     */
    public void display(){
        System.out.println("*****当前温度为：" + this.temperature+"*****");
        System.out.println("*****当前湿度为：" + this.pressure+"*****");
        System.out.println("*****当前气压为：" + this.humidity+"*****");
    }
}
