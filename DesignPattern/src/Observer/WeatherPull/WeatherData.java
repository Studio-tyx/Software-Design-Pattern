package Observer.WeatherPull;

import java.util.Observable;

/**
 * @author TYX
 * @name WeatherData
 * @description
 * @createTime 2021/4/25 16:50
 **/
public class WeatherData extends Observable {
    private float temperature, humidity, pressure;
    public WeatherData() {}

    public void measurementsChanged() {
        setChanged();   //一定要有这个！
        notifyObservers();
        System.out.println();
    }

    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }

    public float getTemperature() {
        return temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }
}
