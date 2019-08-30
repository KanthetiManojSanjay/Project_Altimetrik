package com.example.demo.service;

import com.example.demo.entity.FlightEntity;
import com.example.demo.model.SearchFlights;
import com.example.demo.repo.FlightRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

@Service
public class FlightService {

    @Autowired
    private FlightRepository flightRepository;

    @Cacheable(value = "flightsCache",key ="#flights")
    public List<SearchFlights> getFlights(String source, String destination, Calendar travelDate){
        List<FlightEntity> flightsEntity= flightRepository.getFlights(source,destination,travelDate);

        List<SearchFlights> availableFlights=new ArrayList<>();

        flightsEntity.forEach( f->{
            SearchFlights flight=new SearchFlights();
            flight.setFlightNumber(f.getFlightNumber());
            flight.setSourceCity(f.getSource());
            flight.setDestinationCity(f.getDestination());
            flight.setAirLineName(f.getAirLineName());
            flight.setDepartureTime(f.getDepartureTime());
            flight.setArrivalTime(f.getArrivalTime());
            flight.setDuration(f.getDuration());
            flight.setNoOfStops(f.getNoOfStops());
            flight.setPrice(f.getPrice());
            flight.setTotalNoOfResults(f.getTotalNoOfResults());
            availableFlights.add(flight);
        });

        return availableFlights;

    }

}
