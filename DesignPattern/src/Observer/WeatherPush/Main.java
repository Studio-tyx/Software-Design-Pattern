package Observer.WeatherPush;

/**
 * @author TYX
 * @name Main
 * @description 主函数（推函数）
 * @createTime 2021/4/25 17:00
 **/
public class Main {
    public static void main(String[] args) {
        WeatherData weatherData=new WeatherData();
        CurrentConditionsDisplay current=new CurrentConditionsDisplay(weatherData);
        StatisticsDisplay statist=new StatisticsDisplay(weatherData);
        ForecastDisplay forecast=new ForecastDisplay(weatherData);

        weatherData.setMeasurements(80, 65, 30.4f);
        weatherData.setMeasurements(82, 70, 29.2f);
        weatherData.setMeasurements(78, 90, 29.2f);

    }
}
