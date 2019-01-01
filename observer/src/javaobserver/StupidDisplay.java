package javaobserver;

import java.util.Observable;
import java.util.Observer;

public class StupidDisplay implements Observer, DisplayElement {
    private float temperature;
    private float humidity;

    public StupidDisplay(WeatherData weatherData) {
        weatherData.addObserver(this);
    }

    @Override
    public void update(Observable o, Object arg) {
        if(o instanceof WeatherData) {
            WeatherData weatherData = (WeatherData)o;
            this.temperature = weatherData.getTemperature();
            this.humidity = weatherData.getHumidity();
            display();
        }
    }

    @Override
    public void display() {
        System.out.printf("stupid temperature %.2f, humidity %.2f\n", this.temperature, this.humidity);
    }
}
