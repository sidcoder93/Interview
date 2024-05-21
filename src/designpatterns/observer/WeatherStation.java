package designpatterns.observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherStation implements Subject{

    List<Observer> list = new ArrayList<>();
    private String weather;
    @Override
    public void addObserver(Observer ob) {
        list.add(ob);

    }

    @Override
    public void removeObserver(Observer ob) {
        list.remove(ob);

    }

    @Override
    public void notifyObserver() {

        for(Observer observer : list){
            observer.update(this.weather);
        }

    }

    public void setWeather(String weather){

        this.weather = weather;
        notifyObserver();
    }
}
