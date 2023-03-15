package net.codegen.Sun.Travel.Agency.model;

import jakarta.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "Hotels")
public class Hotel implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "hotelId", nullable = false, updatable = false)
    private Long hotelId;

    @Column(name = "hotelName")
    private String hotelName;

    public Hotel() {
        //default constructor
    }

    public Hotel(String hotel_name) {
        //constructor with parameters
        this.hotelName = hotel_name;
    }

    public Long getHotelId() {
        //getter method for hotel ID
        return hotelId;
    }

    public void setHotelId(Long hotelId) {
        //setter method for hotel ID
        this.hotelId = hotelId;
    }

    public String getHotelName() {
        //getter method for hotel name
        return hotelName;
    }

    public void setHotelName(String hotelName) {
        //setter method for hotel name
        this.hotelName = hotelName;
    }

    @Override
    public String toString() {
        //toString method
        return "Hotel{" + "Hotel ID = " + hotelId + "Hotel Name = " + hotelName + '}';
    }

}