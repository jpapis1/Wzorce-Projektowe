package notification;

import weather.WeatherForecast;

public class RadioNews implements Observer {
    public void updateForecast(WeatherForecast weatherForecast) {
        System.out.println("Radio - temperatura: " + weatherForecast.getTemperature() + " ciśnienie: " + weatherForecast.getPressure());

    }
}
