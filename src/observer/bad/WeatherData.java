package observer.bad;

/**
 * 气象站数据类
 *
 * @author Vangelis
 * @date 2019-06-16 20:46
 */
public class WeatherData {
    public WeatherData(){
    }
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
     * 公告板
     */
    private CurrentConditions currentConditions;
    public WeatherData(CurrentConditions currentConditions) {
        this.currentConditions = currentConditions;
    }
    /**
     *  更新通知公告板
     */
    public void dataChange() {
        // 调用通知面板
        currentConditions.update(this.temperature,this.pressure,this.humidity);
    }
    /**
     * 产生新的数据气象站，后续代码应该是查库或者其他方式
     * @param temperature 温度
     * @param pressure 湿度
     * @param humidity 气压
     */
    public void setData(float temperature, float pressure, float humidity) {
        this.temperature = temperature;
        this.pressure = pressure;
        this.humidity = humidity;
        dataChange();
    }
    public float getTemperature() {
        return temperature;
    }
    public float getPressure() {
        return pressure;
    }
    public float getHumidity() {
        return humidity;
    }
}
