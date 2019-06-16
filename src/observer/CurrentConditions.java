package observer;

/**
 * 面板类
 *
 * @author Vangelis
 * @date 2019-06-16 20:50
 */
public class CurrentConditions implements Observer {
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
     *  显示
     */
    public void display(){
        System.out.println("*****Current：当前温度为：" + this.temperature+"*****");
        System.out.println("*****Current：当前湿度为：" + this.pressure+"*****");
        System.out.println("*****Current：当前气压为：" + this.humidity+"*****");
    }

    /**
     * 更新数据，用于给Subject调用
     *
     * @param temperature 温度
     * @param pressure    湿度
     * @param humidity    气压
     */
    @Override
    public void update(float temperature, float pressure, float humidity) {
        this.temperature = temperature;
        this.pressure = pressure;
        this.humidity = humidity;
        display();
    }
}
