package ObserverModeDesignWeatherDashBoard;

/**
 * 类名:     Main
 * 描述:
 * 隶属于:   WeatherDashBoard
 * 建立事件： 2022/5/15
 * 作者：    llonvne
 * 邮箱：    Work@llonvne.cn
 * Copyright (c) 2022,All rights reserved.
 */
public class Main {
    public static void main(String[] args) {
//        建立气象站
        WeatherSubject weatherSubject = new WeatherSubject();

        WeatherObserver[] weatherObservers = new WeatherObserver[10];
        for (int i = 0;i < weatherObservers.length;i++){
            weatherObservers[i] = new WeatherObserver(weatherSubject);
            weatherSubject.registerObserver(weatherObservers[i]);
        }

        weatherSubject.setMeasurement(30,10,10);

        weatherObservers[0].unsubscribe();

        weatherSubject.setMeasurement(9,9,9);
    }
}
