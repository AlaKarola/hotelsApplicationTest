package ala.wiercioch.hotelsapplicationtest.data.rest.remote.request;

public class RoomsReservationDto {

    private int id;
    private int roomId;
    private int days;

    public RoomsReservationDto() {
    }


    public int getId() {
        return id;
    }

    public int getRoomId() {
        return roomId;
    }

    public int getDays() {
        return days;
    }


    public void setId(int id) {
        this.id = id;
    }

    public void setRoomId(int roomId) {
        this.roomId = roomId;
    }

    public void setDays(int days) {
        this.days = days;
    }
}
