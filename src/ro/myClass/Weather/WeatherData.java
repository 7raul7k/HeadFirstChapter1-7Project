package ro.myClass.Weather;

import java.util.ArrayList;

public class WeatherData implements Subject,Observer {
    private ArrayList<Observer> observers;
    private float temperature;
    private float humidity;
    private float pressure;

    private ForecastDisplay forecastDisplay;
    private  StatisticsDisplay statisticsDisplay;
    public WeatherData() {
        observers = new ArrayList();

    }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o){
        int i = observers.indexOf(o);
        if (i >= 0) {
            observers.remove(i);
        }
    }

    @Override
    public void notifyObservers() {
        for (int i = 0; i < observers.size(); i++) {
            Observer observer = (Observer) observers.get(i);
            observer.update(temperature, humidity, pressure);
        }
    }

    @Override
    public void update(float temperature,float humidity,float pressure){

    }

    public void measurementsChanged() {
        notifyObservers();
    }

    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }


    public float getTemperature() {
        return temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }
}
