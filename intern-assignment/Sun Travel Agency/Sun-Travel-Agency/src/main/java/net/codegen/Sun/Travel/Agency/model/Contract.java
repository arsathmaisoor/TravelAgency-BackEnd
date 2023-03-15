package net.codegen.Sun.Travel.Agency.model;
import com.fasterxml.jackson.annotation.JsonIdentityReference;
import jakarta.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;
@Entity
@Table(name = "Contracts")
//@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
public class Contract implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Contract_ID", nullable = false, updatable = false)
    private Long contractId;
    @ManyToOne
    //@JoinColumn(name = "hotel name")
    //@Column(name = "Hotel", nullable = false, updatable = true)
    private Hotel hotel;
    @Column(name = "Valid_From", nullable = false, updatable = true)
    @Temporal(TemporalType.DATE)
    private Date fromDate;
    @Column(name = "Valid_To", nullable = false, updatable = true)
    @Temporal(TemporalType.DATE)
    private Date toDate;
    @Column(name = "Markup", nullable = false, updatable = true)
    private Float markUp;
    @Column(name = "HotelName", nullable = false, updatable = true)
    private String hotelName;
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JsonIdentityReference(alwaysAsId = true)
    private List < RoomType > roomTypes;
    //dafault constructor starts here
    public Contract() {}
    public Contract(Hotel hotel, Date fromDate, Date toDate, Float markUp, List < RoomType > roomTypes) {
        this.hotel = hotel;
        this.hotelName = hotel.getHotelName();
        this.fromDate = fromDate;
        this.toDate = toDate;
        this.markUp = markUp;
        this.roomTypes = roomTypes;
    }
    //default constructor ends here
    //Get and Set methods starts here
    public Long getContractId() {
        return contractId;
    }
    //    public void setContract_ID(Long contract_ID) {
    //        this.contract_ID = contract_ID;
    //    }
    public Hotel getHotel() {
        return hotel;
    }
    public void setHotel(Hotel hotel) {
        this.hotel = hotel;
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
    public List < RoomType > getRoomTypes() {
        return roomTypes;
    }
    public void setRoomTypes(List < RoomType > roomTypes) {
        this.roomTypes = roomTypes;
    }
    //Get and Set Methods ends here
    //toString method
    @Override
    public String toString() {
        return "Contract{" + "Contract ID = " + contractId + "Hotel = " + hotel.getHotelName() + "Valid From = " + fromDate + "Valid To = " + toDate + "Markup = " + markUp + "Room Types = " + roomTypes + '}';
    }
}