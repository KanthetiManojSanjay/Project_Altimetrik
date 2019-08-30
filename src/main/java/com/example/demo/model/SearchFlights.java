package com.example.demo.model;


import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

public class SearchFlights {

    @NotEmpty(message = "Please enter the origin")
    @NotNull(message="Source is mandatory")
    private String sourceCity;

    @NotEmpty(message = "Please enter the destination")
    @NotNull(message="Destination is mandatory")
    private String destinationCity;

    @NotEmpty(message = "Please enter the travelDate")
    @NotNull(message="TravelDate is mandatory")
    private String travelDate;

    private  String returnDate;
    private String flightNumber;
    private String airLineName;
    private String departureTime;
    private String arrivalTime;
    private String duration;
    private String noOfStops;
    private String price;
    private String totalNoOfResults;

    public String getSourceCity() {
        return sourceCity;
    }

    public void setSourceCity(String sourceCity) {
        this.sourceCity = sourceCity;
    }

    public String getDestinationCity() {
        return destinationCity;
    }

    public void setDestinationCity(String destinationCity) {
        this.destinationCity = destinationCity;
    }

    public String getTravelDate() {
        return travelDate;
    }

    public void setTravelDate(String travelDate) {
        this.travelDate = travelDate;
    }

    public String getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(String returnDate) {
        this.returnDate = returnDate;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public String getAirLineName() {
        return airLineName;
    }

    public void setAirLineName(String airLineName) {
        this.airLineName = airLineName;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(String departureTime) {
        this.departureTime = departureTime;
    }

    public String getArrivalTime() {
        return arrivalTime;
    }

    public void setArrivalTime(String arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getNoOfStops() {
        return noOfStops;
    }

    public void setNoOfStops(String noOfStops) {
        this.noOfStops = noOfStops;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getTotalNoOfResults() {
        return totalNoOfResults;
    }

    public void setTotalNoOfResults(String totalNoOfResults) {
        this.totalNoOfResults = totalNoOfResults;
    }
}
