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


            resultMap.put(temperature.getKey(), temperature.getValue() + 1.0);
        }
        return resultMap;
    }

    public Double average() {
        double sum = 0.0;

        Map<String, Double> temperatures = this.temperatures.getTemperatures();
        for (Map.Entry<String, Double> temperature : temperatures.entrySet()) {
            sum = sum + temperature.getValue();
        }

        return sum / temperatures.entrySet().size();
    }

    public Double mediane() {

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