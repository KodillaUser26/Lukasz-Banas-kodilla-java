package com.kodilla.testing.weather.stub;

import java.util.*;

public class WeatherForecast {
    Temperatures temperatures;

    public WeatherForecast(Temperatures temperatures){
        this.temperatures = temperatures;
    }

    public HashMap<String, Double> calculateForecast() {
        HashMap<String, Double> resultMap = new HashMap<>();

        for(Map.Entry<String, Double> temperature : temperatures.getTemperatures().entrySet()){

            // adding 1 celsius degree to current value
            // as a temporary weather forecast
            resultMap.put(temperature.getKey(), temperature.getValue() + 1.0);
        }
        return resultMap;
    }

    public Double Average() {

        Double average = 0.0;
        int total = 0;
        double value= 0.0;

        for(Map.Entry<String, Double> temperature : temperatures.getTemperatures().entrySet()) {
            average = average + temperature.getValue();
            total++;
            value = average/total;
        }
        return Math.floor(value * 100) / 100;
    }

    public Double Mediane() {

        Double mediane = 0.0;
        List<Double> theList = new ArrayList<>();

        for(Map.Entry<String, Double> temperature : temperatures.getTemperatures().entrySet()) {
            theList.add(temperature.getValue());
        }

        Collections.sort(theList);

        if(theList.size() % 2==0) {
            mediane = theList.get((theList.size() -1) / 2+1);
        }
        else {
            mediane = theList.get((theList.size() -1) / 2);
        }

        return mediane;

    }
}