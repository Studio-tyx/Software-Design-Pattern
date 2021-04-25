package Observer.WeatherPull;

import java.util.Observable;
import java.util.Observer;

/**
 * @author TYX
 * @name CurrentConditionsDisplay
 * @description
 * @createTime 2021/4/25 16:54
 **/
public class CurrentConditionsDisplay implements Observer {
    private float temperature;
    private float humidity;
    private Observable weatherData;

    public CurrentConditionsDisplay(Observable weatherData) {
        weatherData.addObserver(this);
        this.weatherData = weatherData;
    }

    @Override
    public void update(Observable o, Object arg) {
        if(o instanceof WeatherData){
            WeatherData w=(WeatherData)o;
            this.temperature=w.getTemperature();
            this.humidity=w.getHumidity();
            display();
        }
    }
    public void display(){
        System.out.println("CurrentConditionsDisplay: temperature:" + temperature
                + ",humidity:" + humidity);
    }
}
