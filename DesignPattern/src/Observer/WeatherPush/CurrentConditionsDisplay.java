package Observer.WeatherPush;

/**
 * @author TYX
 * @name CurrentConditionsDisplay
 * @description
 * @createTime 2021/4/25 16:54
 **/
public class CurrentConditionsDisplay implements Observer{
    private float temperature;
    private float humidity;
    private Subject weatherData;

    public CurrentConditionsDisplay(Subject weatherData) {
        weatherData.registerObserver(this);
        this.weatherData = weatherData;
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temperature = temp;
        this.humidity = humidity;
        display();
    }

    public void display(){
        System.out.println("Current conditions: temperature:" + temperature
                + ",humidity:" + humidity);
    }
}
