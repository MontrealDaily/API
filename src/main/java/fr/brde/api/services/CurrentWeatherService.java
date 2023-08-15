package fr.brde.api.services;

import fr.brde.api.entities.CurrentWeather;
import fr.brde.api.repositories.CurrentWeatherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class CurrentWeatherService
{

    @Autowired
    private CurrentWeatherRepository currentWeatherRepository;

    public List<CurrentWeather> listAllWeathers()
    {
        return this.currentWeatherRepository.findAll();
    }

    public CurrentWeather getLastWeather(int id)
    {
        // Change to the last inserted data in DB
        return this.currentWeatherRepository.findById(id).get();
    }
}
