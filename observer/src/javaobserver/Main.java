package javaobserver;

public class Main {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        GeneralDisplay generalDisplay = new GeneralDisplay(weatherData);
        StupidDisplay stupidDisplay = new StupidDisplay(weatherData);
        weatherData.measurementChanged(10, 65, 124);
    }
}
