package designpatterns.observer;

public class WebAppObserver implements Observer{

    private String weather;
    @Override
    public void update(Object weather) {
        this.setWeather((String) weather);
        this.display();

    }

    public void setWeather(String weather){
        this.weather = weather;
    }

    public void display(){
        System.out.println("Weather shown on WebApp is " +this.weather);
    }
}
