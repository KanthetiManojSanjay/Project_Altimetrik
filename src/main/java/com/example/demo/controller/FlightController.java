package com.example.demo.controller;

import com.example.demo.model.SearchFlights;
import com.example.demo.service.FlightService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/flights")
public class FlightController {

    @Autowired
    private FlightService flightService;

    @GetMapping(value = "/{source}/{destination}/{travelDate}",produces = "application/json",consumes = "application/json")
    public ResponseEntity<List<SearchFlights>> searchFlights(@PathVariable String source, @PathVariable String destination,
                                                             @PathVariable String travelDate) {

        SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy");
        Date date= null;
        try {
            date = sdf.parse(travelDate);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        Calendar cal=Calendar.getInstance();
        cal.setTime(date);

        List<SearchFlights> availableFLights= flightService.getFlights(source,destination,cal);

        return new ResponseEntity<List<SearchFlights>>(availableFLights,HttpStatus.OK);
    }
}
