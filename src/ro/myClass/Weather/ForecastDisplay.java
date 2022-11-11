package ro.myClass.Weather;

public class ForecastDisplay implements Observer,DisplayElement {
    private float currentPressure = 29.92f;
    private float lastPressure;
    private WeatherData weatherData;

    public ForecastDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }


    public void update(float temp, float humidity, float pressure) {
        lastPressure = currentPressure;
        currentPressure = pressure;

        display();
    }

    public void display() {
        System.out.print("Forecast: ");
        if (currentPressure > lastPressure) {
            System.out.println("You can go out with animal");
        } else if (currentPressure == lastPressure) {
            System.out.println("More of the same weather,you can go out with your animal ");
        } else if (currentPressure < lastPressure) {
            System.out.println("It's rainy weather,stay home !");
        }
    }
}
