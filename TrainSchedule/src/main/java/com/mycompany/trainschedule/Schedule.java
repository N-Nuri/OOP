package com.mycompany.trainschedule;

public class Schedule {
    private String departureStation;
    private Time departureTime;
    private String destinationStation;
    private Time estimatedArrivalTime;
    private StopList stop;
    private Train trainType;

    public Schedule(String departureStation, Time departureTime, String destinationStation,
            Time estimatedArrivalTime, StopList stop, Train trainType) {
        this.setDepartureStation(departureStation);
        this.setDepartureTime(departureTime);
        this.setDestinationStation(destinationStation);
        this.setEstimatedArrivalTime(estimatedArrivalTime);
        this.setStop(stop);
        this.trainType = trainType;
    }

    public String getDepartureStation() {
        return departureStation;
    }

    public void setDepartureStation(String departureStation) {
        this.departureStation = departureStation;
    }

    public Time getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(Time departureTime) {
        this.departureTime = departureTime;
    }

    public String getDestinationStation() {
        return destinationStation;
    }

    public void setDestinationStation(String destinationStation) {
        this.destinationStation = destinationStation;
    }

    public Time getEstimatedArrivalTime() {
        return estimatedArrivalTime;
    }

    public void setEstimatedArrivalTime(Time estimatedArrivalTime) {
        this.estimatedArrivalTime = estimatedArrivalTime;
    }

    public StopList getStop() {
        return stop;
    }

    public void setStop(StopList stop) {
        this.stop = stop;
    }

    public String getTrainType() {
        return this.trainType.getType();
    }
}
