package Observer.WeatherPull;

import java.util.Observable;
import java.util.Observer;

/**
 * @author TYX
 * @name StatisticsDisplay
 * @description
 * @createTime 2021/4/25 16:56
 **/
public class StatisticsDisplay implements Observer {
    private float pressure;
    private float humidity;
    private Observable weatherData;

    public StatisticsDisplay(Observable weatherData) {
        weatherData.addObserver(this);
        this.weatherData = weatherData;
    }


    public void display(){
        System.out.println("Statistics conditions: pressure:" + pressure
                + ",humidity:" + humidity);
    }

    @Override
    public void update(Observable o, Object arg) {
        if(o instanceof WeatherData){
            WeatherData w=(WeatherData)o;
            this.pressure=w.getPressure();
            this.humidity=w.getHumidity();
            display();
        }
    }
}
