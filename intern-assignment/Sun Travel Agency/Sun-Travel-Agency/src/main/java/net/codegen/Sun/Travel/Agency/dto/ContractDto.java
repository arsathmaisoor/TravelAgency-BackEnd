package net.codegen.Sun.Travel.Agency.dto;

import com.fasterxml.jackson.annotation.JsonIdentityReference;
import jakarta.persistence.*;
import net.codegen.Sun.Travel.Agency.model.Hotel;
import net.codegen.Sun.Travel.Agency.model.RoomType;

import java.util.Date;
import java.util.List;

public class ContractDto {

    private Long hotelId;
    private String hotelName;
    private Date fromDate;
    private Date toDate;
    private Float markUp;
    private List<RoomType> roomTypes;

    public ContractDto() {
    }

    public ContractDto(Long hotelId, String hotelName, Date fromDate, Date toDate, Float markUp, List<RoomType> roomTypes) {
        this.hotelId = hotelId;
        this.hotelName = hotelName;
        this.fromDate = fromDate;
        this.toDate = toDate;
        this.markUp = markUp;
        this.roomTypes = roomTypes;
    }


    public Long getHotelId() {
        return hotelId;
    }

    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    public Date getFromDate() {
        return fromDate;
    }

    public void setFromDate(Date fromDate) {
        this.fromDate = fromDate;
    }

    public Date getToDate() {
        return toDate;
    }

    public void setToDate(Date toDate) {
        this.toDate = toDate;
    }

    public Float getMarkUp() {
        return markUp;
    }

    public void setMarkUp(Float markUp) {
        this.markUp = markUp;
    }

    public List<RoomType> getRoomType() {return roomTypes;}

    public void setRoomTypes(List<RoomType> roomTypes)
    {this.roomTypes = roomTypes;}


}
