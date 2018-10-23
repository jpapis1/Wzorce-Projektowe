package notification;

import weather.WeatherForecast;

public interface Observer {
    void updateForecast(WeatherForecast weatherForecast);
}
