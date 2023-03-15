package net.codegen.Sun.Travel.Agency.dto;

public class roomTypeDto {
    private String roomTypeName;
    private Float price;
    private Integer noOfRooms;
    private Integer maxAdults;

    public roomTypeDto() {
    }

    public roomTypeDto(String roomTypeName, Float price, Integer noOfRooms, Integer maxAdults) {
        this.roomTypeName = roomTypeName;
        this.price = price;
        this.noOfRooms = noOfRooms;
        this.maxAdults = maxAdults;
    }

    public String getRoomTypeName() {
        return roomTypeName;
    }

    public void setRoomTypeName(String roomTypeName) {
        this.roomTypeName = roomTypeName;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public Integer getNoOfRooms() {
        return noOfRooms;
    }

    public void setNoOfRooms(Integer noOfRooms) {
        this.noOfRooms = noOfRooms;
    }

    public Integer getMaxAdults() {
        return maxAdults;
    }

    public void setMaxAdults(Integer maxAdults) {
        this.maxAdults = maxAdults;
    }
}
