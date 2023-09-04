package fr.brde.api.repositories;

import fr.brde.api.entities.ForecastWeather;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ForecastWeatherRepository extends JpaRepository<ForecastWeather, Long>
{ }
