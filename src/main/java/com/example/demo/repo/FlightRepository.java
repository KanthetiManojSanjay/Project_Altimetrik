package com.example.demo.repo;

import com.example.demo.entity.FlightEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Calendar;
import java.util.List;

public interface FlightRepository extends JpaRepository<FlightEntity,String> {

    @Query("select s from FlightEntity f where f.source=:source and f.destination=:dest and f.flightAvailableDate:tDate")
    List<FlightEntity> getFlights(@Param("source") String source, @Param("destination") String dest, @Param("tDate")Calendar date);
}
