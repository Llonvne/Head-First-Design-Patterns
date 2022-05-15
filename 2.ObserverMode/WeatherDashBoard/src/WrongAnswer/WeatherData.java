package WrongAnswer;

/**
 * 类名:     WeatherData
 * 描述:     WeatherData 类 提供信息,作为所有实例基本类
 * 隶属于:   WeatherDashBoard
 * 建立事件： 2022/5/15
 * 作者：    llonvne
 * 邮箱：    Work@llonvne.cn
 * Copyright (c) 2022,All rights reserved.
 */
public class WeatherData {
    public double getTemperature() {
        return 0;
    }

    public double getHumidity() {
        return 0;
    }

    public double getPressure() {
        return 0;
    }

    public void measurementsChanged() {
        double temp = getTemperature();
        double humidity = getHumidity();
        double pressure = getPressure();

//        更新当前板子
//        currentConditionDisplay.update(temp, humidity, pressure);
//        statisticsDisplay.update(temp,humidity,pressure);
//        forecastDisplay.update(temp,humidity,pressure);

        // 我们在针对实现编程而非接口
        // 对于每个布告板都要修改代码
        // 无法在运行时增加删除布告板
        // 尚未封装改变的部分
    }
}
