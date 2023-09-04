package fr.brde.api.controllers;

import fr.brde.api.entities.CurrentWeather;
import fr.brde.api.services.CurrentWeatherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/currentWeather")
public class CurrentWeatherController
{

    @Autowired
    CurrentWeatherService currentWeatherService;

    @GetMapping("")
    public List<CurrentWeather> list()
    {
        return this.currentWeatherService.listAllWeathers();
    }

    @CrossOrigin(origins = "http://localhost:8100")
    @GetMapping("/last")
    public CurrentWeather getLast()
    {
        return this.currentWeatherService.getLastWeather();
    }

}
