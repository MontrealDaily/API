package fr.brde.api.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "CurrentWeather")
public class CurrentWeather {

    private int id;
    private String time;

    private int temp; // °C
    private String lastUpdated;
    private String weatherCondition;
    private int wind; // km/h

    public CurrentWeather() {}

    public CurrentWeather(int id,
                          String time,
                          int temp,
                          String lastUpdated,
                          String weatherCondition,
                          int wind)
    {
        this.id = id;
        this.time = time;
        this.temp = temp;
        this.lastUpdated = lastUpdated;
        this.weatherCondition = weatherCondition;
        this.wind = wind;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getId()
    {
        return this.id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public String getTime()
    {
        return time;
    }

    public void setTime(String time)
    {
        this.time = time;
    }

    public int getTemp()
    {
        return temp;
    }

    public void setTemp(int temp)
    {
        this.temp = temp;
    }

    public String getLastUpdated()
    {
        return lastUpdated;
    }

    public void setLastUpdated(String lastUpdated)
    {
        this.lastUpdated = lastUpdated;
    }

    public String getWeatherCondition()
    {
        return weatherCondition;
    }

    public void setWeatherCondition(String weatherCondition)
    {
        this.weatherCondition = weatherCondition;
    }

    public int getWind()
    {
        return wind;
    }

    public void setWind(int wind)
    {
        this.wind = wind;
    }

}
