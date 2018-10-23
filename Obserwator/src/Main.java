import notification.InternetNews;
import notification.RadioNews;
import notification.TvNews;
import weather.WeatherForecast;

public class Main {

    public static void main(String[] args) {
	// write your code here
        WeatherForecast weatherForecast = new WeatherForecast(25,1003);
        RadioNews radioNews = new RadioNews();
        InternetNews internetNews = new InternetNews();
        TvNews tvNews = new TvNews();
        weatherForecast.registerObserver(radioNews);
        weatherForecast.registerObserver(internetNews);
        weatherForecast.registerObserver(tvNews);
        weatherForecast.notifyObservers();
        weatherForecast.unregisterObserver(radioNews);
        weatherForecast.unregisterObserver(tvNews);
        System.out.println("Tylko internetowy:");
        weatherForecast.updateForecast(18,1007);
        weatherForecast.notifyObservers();
    }
}
