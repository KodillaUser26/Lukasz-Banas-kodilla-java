package com.kodilla.testing.weather.mock;

import com.kodilla.testing.weather.stub.Temperatures;
import com.kodilla.testing.weather.stub.WeatherForecast;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;




@ExtendWith(MockitoExtension.class)
class WeatherForecastTestSuite {

    @Mock
    private Temperatures temperaturesMock;
    Map<String, Double> temperaturesMap = new HashMap<>();

    @BeforeEach
    void setUp() {
        temperaturesMap.put("Rzeszów", 25.5);
        temperaturesMap.put("Kraków", 26.2);
        temperaturesMap.put("Wrocław", 24.8);
        temperaturesMap.put("Warszawa", 25.2);
        temperaturesMap.put("Gdańsk", 26.1);
    }

    @Test
    void testCalculateForecastWithMock() {

        //Given
        when(temperaturesMock.getTemperatures()).thenReturn(temperaturesMap);

        WeatherForecast weatherForecast = new WeatherForecast(temperaturesMock);

        //When
        int quantityOfSensors = weatherForecast.calculateForecast().size();

        //Then
        assertEquals(5, quantityOfSensors);

    }

    @Test
    void testCalculateAverage() {
        //Given
        WeatherForecast weatherForecast = new WeatherForecast(temperaturesMock);
        when(temperaturesMock.getTemperatures()).thenReturn(temperaturesMap);
        //When
        double average = weatherForecast.average();
        //Then
        assertEquals(25.56, average, 0.01);

    }

    @Test
    void testCalculateMediane() {

        //Given
        WeatherForecast weatherForecast = new WeatherForecast(temperaturesMock);
        when(temperaturesMock.getTemperatures()).thenReturn(temperaturesMap);

        //When
        Double mediane = weatherForecast.mediane();

        //Then
        assertEquals(25.5, mediane);
    }
}