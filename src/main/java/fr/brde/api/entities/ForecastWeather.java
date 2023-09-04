package fr.brde.api.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "ForecastWeather")
public class ForecastWeather
{

    private int id;
    private String time;

    private int morningTemp; // °C
    private int morningWind; // km/h
    private String morningWeatherCondition;

    private int afternoonTemp; // °C
    private int afternoonWind; // km/h
    private String afternoonWeatherCondition;

    private int nightTemp; // °C
    private int nightWind; // km/h
    private String nightWeatherCondition;

    public ForecastWeather() {}

    public ForecastWeather(int id,
                           String time,
                           int morningTemp,
                           int morningWind,
                           String morningWeatherCondition,
                           int afternoonTemp,
                           int afternoonWind,
                           String afternoonWeatherCondition,
                           int nightTemp,
                           int nightWind,
                           String nightWeatherCondition)
    {
        this.id = id;
        this.time = time;
        this.morningTemp = morningTemp;
        this.morningWind = morningWind;
        this.morningWeatherCondition = morningWeatherCondition;
        this.afternoonTemp = afternoonTemp;
        this.afternoonWind = afternoonWind;
        this.afternoonWeatherCondition = afternoonWeatherCondition;
        this.nightTemp = nightTemp;
        this.nightWind = nightWind;
        this.nightWeatherCondition = nightWeatherCondition;
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

    public int getMorningTemp()
    {
        return morningTemp;
    }

    public void setMorningTemp(int morningTemp)
    {
        this.morningTemp = morningTemp;
    }

    public int getMorningWind()
    {
        return morningWind;
    }

    public void setMorningWind(int morningWind)
    {
        this.morningWind = morningWind;
    }

    public String getMorningWeatherCondition()
    {
        return morningWeatherCondition;
    }

    public void setMorningWeatherCondition(String morningWeatherCondition)
    {
        this.morningWeatherCondition = morningWeatherCondition;
    }

    public int getAfternoonTemp()
    {
        return afternoonTemp;
    }

    public void setAfternoonTemp(int afternoonTemp)
    {
        this.afternoonTemp = afternoonTemp;
    }

    public int getAfternoonWind()
    {
        return afternoonWind;
    }

    public void setAfternoonWind(int afternoonWind)
    {
        this.afternoonWind = afternoonWind;
    }

    public String getAfternoonWeatherCondition()
    {
        return afternoonWeatherCondition;
    }

    public void setAfternoonWeatherCondition(String afternoonWeatherCondition)
    {
        this.afternoonWeatherCondition = afternoonWeatherCondition;
    }

    public int getNightTemp()
    {
        return nightTemp;
    }

    public void setNightTemp(int nightTemp)
    {
        this.nightTemp = nightTemp;
    }

    public int getNightWind()
    {
        return nightWind;
    }

    public void setNightWind(int nightWind)
    {
        this.nightWind = nightWind;
    }

    public String getNightWeatherCondition()
    {
        return nightWeatherCondition;
    }

    public void setNightWeatherCondition(String nightWeatherCondition)
    {
        this.nightWeatherCondition = nightWeatherCondition;
    }
}
