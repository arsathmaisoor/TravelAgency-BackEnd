package net.codegen.Sun.Travel.Agency.model;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIdentityReference;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import jakarta.persistence.*;
import jakarta.persistence.criteria.CriteriaBuilder;

import java.io.Serializable;

@Entity
//@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
@Table(name = "RoomTypes")
public class RoomType implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false, updatable = false)
    private Long roomTypeId;

    @Column(name = "Name", nullable = false, updatable = true)
    private String roomTypeName;

    @Column(name = "Price", nullable = false, updatable = true)
    private Float price;

    @Column(name = "Number_of_Rooms", nullable = false, updatable = true)
    private Integer noOfRooms;

    @Column(name = "Max_Adults", nullable = false, updatable = true)
    private Integer maxAdults;

//    @ManyToOne(fetch = FetchType.LAZY)
//    @JoinColumn(name = "Contract_ID")
    //@JsonIdentityReference(alwaysAsId = true)
//    private Contract contract;

    //default constructor starts here
    public RoomType() {}
    public RoomType(Long roomTypeId, String roomTypeName, Float price, Integer noOfRooms, Integer maxAdults/*, Contract contract*/) {
        this.roomTypeId = roomTypeId;
        this.roomTypeName = roomTypeName;
        this.price = price;
        this.noOfRooms = noOfRooms;
        this.maxAdults = maxAdults;
        //this.contract = contract;
    }
    //default constructor ends here

    //Get and Set methods start here
    public Long getRoomTypeId() {
        return roomTypeId;
    }

    public void setRoomTypeID(Long roomTypeId) {
        this.roomTypeId = roomTypeId;
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

//    public Contract getContract() {
//        return contract;
//    }
//
//    public void setContract(Contract contract) {
//        this.contract = contract;
//    }

    //Get and Set methods ends here

    //toString method
    @Override
    public String toString(){
        return "RoomType{"+
                "RoomType ID = "+roomTypeId+
                "RoomType Name = "+roomTypeName+
                "Price = "+price+
                "Number of Rooms = "+noOfRooms+
                "Maximum number of Adults = "+maxAdults+
                //"Contract = "+contract+
                '}';
    }

}
