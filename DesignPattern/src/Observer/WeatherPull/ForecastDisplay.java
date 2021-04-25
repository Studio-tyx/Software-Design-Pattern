package Observer.WeatherPull;

import java.util.Observable;
import java.util.Observer;

/**
 * @author TYX
 * @name ForecastDisplay
 * @description
 * @createTime 2021/4/25 16:59
 **/
public class ForecastDisplay implements Observer {
    private float temperature;
    private float pressure;
    private Observable weatherData;

    public ForecastDisplay(Observable weatherData) {
        weatherData.addObserver(this);
        this.weatherData = weatherData;
    }

    public void display(){
        System.out.println("ForecastDisplay: temperature:" + temperature
                + ",pressure:" + pressure);
    }

    @Override
    public void update(Observable o, Object arg) {
        if(o instanceof WeatherData) {
            WeatherData w = (WeatherData) o;
            this.temperature = w.getTemperature();
            this.pressure = w.getPressure();
            display();
        }
    }
}
