package Observer.WeatherPush;

/**
 * @author TYX
 * @name StatisticsDisplay
 * @description
 * @createTime 2021/4/25 16:56
 **/
public class StatisticsDisplay implements Observer{
    private float pressure;
    private float humidity;
    private Subject weatherData;

    public StatisticsDisplay(Subject weatherData) {
        weatherData.registerObserver(this);
        this.weatherData = weatherData;
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.pressure = pressure;
        this.humidity = humidity;
        display();
    }

    public void display(){
        System.out.println("Statistics conditions: pressure:" + pressure
                + ",humidity:" + humidity);
    }
}
