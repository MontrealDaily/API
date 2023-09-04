package fr.brde.api.services;

import fr.brde.api.entities.ForecastWeather;
import fr.brde.api.repositories.ForecastWeatherRepository;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class ForecastWeatherService
{

    @PersistenceContext
    EntityManager entityManager;

    @Autowired
    private ForecastWeatherRepository forecastWeatherRepository;

    public List<ForecastWeather> listAllForecastWeathers()
    {
        return this.forecastWeatherRepository.findAll();
    }

    public ForecastWeather getLastForecastWeather()
    {
        TypedQuery<ForecastWeather> query = this.entityManager
                .createQuery("SELECT a FROM ForecastWeather a ORDER BY id DESC LIMIT 1", ForecastWeather.class);
        return query.getSingleResult();
    }

}
