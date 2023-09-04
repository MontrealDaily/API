package fr.brde.api.controllers;

import fr.brde.api.entities.ForecastWeather;
import fr.brde.api.services.ForecastWeatherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/forecastWeather")
public class ForecastWeatherController
{

    @Autowired
    ForecastWeatherService forecastWeatherService;

    @GetMapping("")
    public List<ForecastWeather> list()
    {
        return this.forecastWeatherService.listAllForecastWeathers();
    }

    @CrossOrigin(originPatterns = "http://localhost:8100")
    @GetMapping("/last")
    public ForecastWeather getLast()
    {
        return this.forecastWeatherService.getLastForecastWeather();
    }

}
