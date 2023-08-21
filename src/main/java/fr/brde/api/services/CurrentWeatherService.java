package fr.brde.api.services;

import fr.brde.api.entities.CurrentWeather;
import fr.brde.api.repositories.CurrentWeatherRepository;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class CurrentWeatherService
{

    @PersistenceContext
    EntityManager entityManager;

    @Autowired
    private CurrentWeatherRepository currentWeatherRepository;

    public List<CurrentWeather> listAllWeathers()
    {
        return this.currentWeatherRepository.findAll();
    }

    public CurrentWeather getLastWeather()
    {
        TypedQuery<CurrentWeather> query = this.entityManager
                .createQuery("SELECT a FROM CurrentWeather a ORDER BY id DESC LIMIT 1", CurrentWeather.class);
        // Change to the last inserted data in DB
        return query.getSingleResult();
    }
}
