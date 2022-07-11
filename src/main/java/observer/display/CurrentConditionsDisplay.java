package observer.display;

import observer.DisplayElement;
import observer.Observer;
import observer.WeatherData;

public class CurrentConditionsDisplay implements Observer, DisplayElement {
    private float temperature;
    private float humidity;
    private WeatherData weatherData;
    
    public CurrentConditionsDisplay(WeatherData weatherData) {
        this.weatherData = weatherData; // 탈퇴할 때 써먹을 수 있음.
        weatherData.registerObserver(this);
    }
    
    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        display();
    }
    
    public void display() {
        System.out.println("현재 상태: 온도 " + temperature + "F, 습도"+ humidity + "%");
    }
}
