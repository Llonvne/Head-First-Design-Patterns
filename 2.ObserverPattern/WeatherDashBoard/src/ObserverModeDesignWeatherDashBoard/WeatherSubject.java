package ObserverModeDesignWeatherDashBoard;

import ObserverMode.Observer;
import ObserverMode.Subject;

import java.util.Vector;

/**
 * 类名:     WeatherSubject
 * 描述:
 * 隶属于:   WeatherDashBoard
 * 建立事件： 2022/5/15
 * 作者：    llonvne
 * 邮箱：    Work@llonvne.cn
 * Copyright (c) 2022,All rights reserved.
 */
public class WeatherSubject implements Subject {
    private double temperature;
    private double humidity;
    private double pressure;

    public double getTemperature() {
        return temperature;
    }

    public double getHumidity() {
        return humidity;
    }

    public double getPressure() {
        return pressure;
    }

    public void measurementsChanged() {
        notifyObservers();
    }

    public void setMeasurement(double temperature,double humidity,double pressure){
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }

    // Observers Vector
    private final Vector<Observer> observers = new Vector<>();

    @Override
    public final boolean registerObserver(Observer observer) {
        if (!this.observers.contains(observer)) {
            observers.add(observer);
            return true;
        }
        return false;
    }

    @Override
    public final boolean removeObserver(Observer observer) {
        if (this.observers.contains(observer)) {
            observers.remove(observer);
            observer.unsubscribe();
            return true;
        }
        return false;
    }

    @Override
    public final void notifyObservers() {
        for (Observer observer : this.observers) {
            observer.update(getTemperature(),getHumidity(),getPressure());
        }
    }
}
