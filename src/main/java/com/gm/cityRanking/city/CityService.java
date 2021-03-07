package com.gm.cityRanking.city;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CityService {

    public List<City> getCities() {
        return List.of(
                new City("Raleigh", "is suburbia", 4)
        );
    }
}
