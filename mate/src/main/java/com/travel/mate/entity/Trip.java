package com.travel.mate.entity;

import java.sql.Time;

public class Trip {
    private String tripId;
    private String destination;
    private Time createAt;
    private String startDate;
    private String endDate;
    private String tripType;
    private String Description;
    private String status;

    public Trip(String tripId, String destination, Time createAt, String startDate, String endDate, String tripType, String description, String status) {
        this.tripId = tripId;
        this.destination = destination;
        this.createAt = createAt;
        this.startDate = startDate;
        this.endDate = endDate;
        this.tripType = tripType;
        Description = description;
        this.status = status;
    }

    public String getTripId() {
        return tripId;
    }

    public void setTripId(String tripId) {
        this.tripId = tripId;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public Time getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Time createAt) {
        this.createAt = createAt;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public String getTripType() {
        return tripType;
    }

    public void setTripType(String tripType) {
        this.tripType = tripType;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Trip{" +
                "tripId='" + tripId + '\'' +
                ", destination='" + destination + '\'' +
                ", createAt=" + createAt +
                ", startDate='" + startDate + '\'' +
                ", endDate='" + endDate + '\'' +
                ", tripType='" + tripType + '\'' +
                ", Description='" + Description + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
