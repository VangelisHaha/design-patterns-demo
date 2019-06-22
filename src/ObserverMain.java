import observer.*;

/**
 * 观察者模式测试类
 *
 * @author Vangelis
 * @date 2019-06-16 20:58
 */
public class ObserverMain {
    public static void main(String[] args) {
        WeatherDataSubject weatherDataSubject = new WeatherDataSubject();
        CurrentConditions currentConditions = new CurrentConditions();
        weatherDataSubject.registerObserver(currentConditions);
        weatherDataSubject.setData(37,150,40);
        UnderConditions underConditions = new UnderConditions();
        weatherDataSubject.registerObserver(underConditions);
        weatherDataSubject.setData(37,150,40);
    }
}
