package ala.wiercioch.hotelsapplicationtest.data.rest.remote.response;

public class RoomsDto {
    private int id;
    private int beds;
    private double price;


    public RoomsDto() {
    }

    public int getId() {
        return id;
    }

    public int getBeds() {
        return beds;
    }

    public double getPrice() {
        return price;
    }



    public void setId(int id) {
        this.id = id;
    }

    public void setBeds(int beds) {
        this.beds = beds;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}


