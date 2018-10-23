package notification;

import weather.WeatherForecast;

public class TvNews implements Observer {
    public void updateForecast(WeatherForecast weatherForecast) {
        System.out.println("TvNews - temperatura: " + weatherForecast.getTemperature() + " ciśnienie: " + weatherForecast.getPressure());

    }
}
