package Observer.WeatherPush;

import java.util.ArrayList;
import java.util.List;

/**
 * @author TYX
 * @name WeatherData
 * @description
 * @createTime 2021/4/25 16:50
 **/
public class WeatherData implements Subject{
    private List<Observer> observers;
    private float temperature, humidity, pressure;

    public WeatherData() {
        observers=new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        int index=observers.indexOf(o);
        if(index<observers.size())  observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        for(Observer o:observers){
            o.update(temperature,humidity,pressure);
        }
        System.out.println();
    }

    public void setMeasurements(float temperature,
                                float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }

    private void measurementsChanged(){
        notifyObservers();
    }
}
