package Observer.WeatherPush;

/**
 * @author TYX
 * @name ForecastDisplay
 * @description
 * @createTime 2021/4/25 16:59
 **/
public class ForecastDisplay implements Observer{
    private float temperature;
    private float pressure;
    private Subject weatherData;

    public ForecastDisplay(Subject weatherData) {
        weatherData.registerObserver(this);
        this.weatherData = weatherData;
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temperature = temp;
        this.pressure = pressure;
        display();
    }
    public void display(){
        System.out.println("Forecast conditions: temperature:" + temperature
                + ",pressure:" + pressure);
    }
}
