package weather;

import notification.Observer;

import java.util.HashSet;
import java.util.Set;

public class WeatherForecast implements Observable {
    int temperature;
    int pressure;
    Set<Observer> registeredObservers = new HashSet<>();

    public WeatherForecast(int temperature, int pressure) {
        this.temperature = temperature;
        this.pressure = pressure;
    }
    public void updateForecast(int temperature, int pressure) {
        this.temperature = temperature;
        this.pressure = pressure;
    }

    public int getTemperature() {
        return temperature;
    }

    public int getPressure() {
        return pressure;
    }

    public Set<Observer> getRegisteredObservers() {
        return registeredObservers;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public void setPressure(int pressure) {
        this.pressure = pressure;
    }
    public void registerObserver(Observer observer) {
        registeredObservers.add(observer);
    }
    public void unregisterObserver(Observer observer) {
        registeredObservers.remove(observer);
    }
    public void notifyObservers() {
        for (Observer o : registeredObservers) {
            o.updateForecast(this);
        }
    }
}
