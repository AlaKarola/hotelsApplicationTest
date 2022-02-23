package ala.wiercioch.hotelsapplicationtest.data.rest.remote.response;

import ala.wiercioch.hotelsapplicationtest.data.rest.remote.StatusDto;
import ala.wiercioch.hotelsapplicationtest.data.rest.remote.request.PersonReservationDto;
import ala.wiercioch.hotelsapplicationtest.data.rest.remote.request.RoomsReservationDto;

public class ReservationsDto {

    private int id;
    private StatusDto status;
    private RoomsReservationDto roomsReservation;
    private PersonReservationDto person;

    public ReservationsDto() {
    }

    public int getId() {
        return id;
    }

    public StatusDto getStatus() {
        return status;
    }

    public RoomsReservationDto getRoomsReservation() {
        return roomsReservation;
    }

    public PersonReservationDto getPerson() {
        return person;
    }


    public void setId(int id) {
        this.id = id;
    }

    public void setStatus(StatusDto status) {
        this.status = status;
    }

    public void setRoomsReservation(RoomsReservationDto roomsReservation) {
        this.roomsReservation = roomsReservation;
    }

    public void setPerson(PersonReservationDto person) {
        this.person = person;
    }
}
