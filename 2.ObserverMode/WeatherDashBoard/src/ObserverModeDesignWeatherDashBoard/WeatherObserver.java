package ObserverModeDesignWeatherDashBoard;

import ObserverMode.Observer;
import ObserverMode.Subject;

/**
 * 类名:     WeatherObserver
 * 描述:
 * 隶属于:   WeatherDashBoard
 * 建立事件： 2022/5/15
 * 作者：    llonvne
 * 邮箱：    Work@llonvne.cn
 * Copyright (c) 2022,All rights reserved.
 */
public class WeatherObserver implements Observer, DashBoardDisplayable {
    private Subject subject;
    private double temperature;
    private double humidity;
    private double pressure;

    public WeatherObserver(Subject subject){
        this.subject = subject;
    }

    @Override
    public void update(double temperature, double humidity, double pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;

        display();
    }

    @Override
    public void unsubscribe() {
        this.subject.removeObserver(this);
        this.subject = null;
    }


    @Override
    public void display() {
        System.out.println("temp" + temperature + " humidity " + humidity + " pressure " + pressure);
    }
}
