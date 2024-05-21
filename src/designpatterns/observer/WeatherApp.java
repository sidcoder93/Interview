package designpatterns.observer;

public class WeatherApp {

    public static void main(String[] args) {

        Observer mobile =new MobileObeserver();
        Observer web = new WebAppObserver();

        WeatherStation ws = new WeatherStation();
        ws.addObserver(mobile);
        ws.addObserver(web);

        ws.setWeather("Sunny");




    }
}
