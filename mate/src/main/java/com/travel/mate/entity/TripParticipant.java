package com.travel.mate.entity;

public class TripParticipant {
    private String userId;
    private String tripId;
    private TripStatus status;

    public TripParticipant(String userId, String tripId, TripStatus status) {
        this.userId = userId;
        this.tripId = tripId;
        this.status = status;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getTripId() {
        return tripId;
    }

    public void setTripId(String tripId) {
        this.tripId = tripId;
    }

    public TripStatus getStatus() {
        return status;
    }

    public void setStatus(TripStatus status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "TripParticipant{" +
                "userId='" + userId + '\'' +
                ", tripId='" + tripId + '\'' +
                ", status=" + status +
                '}';
    }
}
