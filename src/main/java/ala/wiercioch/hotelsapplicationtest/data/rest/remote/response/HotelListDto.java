package ala.wiercioch.hotelsapplicationtest.data.rest.remote.response;

public class HotelListDto {
    private int id;
    private String name;
    private RoomsDto rooms;


    public HotelListDto() {
    }


    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public RoomsDto getRooms() {
        return rooms;
    }


    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRooms(RoomsDto rooms) {
        this.rooms = rooms;
    }
}
