package ala.wiercioch.hotelsapplicationtest.data.rest.remote.request;

public class PersonReservationDto {
    private String name;
    private int phone;
    private String address;
    private int floor;


    public PersonReservationDto() {
    }

    public String getName() {
        return name;
    }

    public int getPhone() {
        return phone;
    }

    public String getAddress() {
        return address;
    }

    public int getFloor() {
        return floor;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }
}
