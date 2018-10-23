package notification;

import weather.WeatherForecast;

public class InternetNews implements Observer{
    public void updateForecast(WeatherForecast weatherForecast) {
        System.out.println("Internet - temperatura: " + weatherForecast.getTemperature() + " ciśnienie: " + weatherForecast.getPressure());
    }
}
