package observer;

/**
 * 气象站数据类
 *
 * @author Vangelis
 * @date 2019-06-16 20:46
 */
public class WeatherDataSubject implements Subject{
    public WeatherDataSubject(){
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
     *  观察者
     */
    private Observer observer;
    /**
     *  更新通知公告板
     */
    public void dataChange() {
        notifyObserver(observer);
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
    /**
     * 注册
     *
     * @param observer  observer
     */
    @Override
    public void registerObserver(Observer observer) {
        this.observer = observer;
    }

    /**
     * 删除
     *
     * @param observer observer
     */
    @Override
    public void removeObserver(Observer observer) {
        this.observer = null;
    }
    /**
     * 通知
     *
     * @param observer observer
     */
    @Override
    public void notifyObserver(Observer observer) {
        if (this.observer!=null) {
            observer.update(this.temperature,this.pressure,this.humidity);
        }
    }
}
