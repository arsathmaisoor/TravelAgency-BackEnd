package net.codegen.Sun.Travel.Agency.dto;

import java.util.List;

public class HotelDto {
    private String hotelName ;
    private List<Long> contractId;

    public HotelDto() {
    }

    public HotelDto(String hotelName, List<Long> contractId) {
        this.hotelName = hotelName;
        this.contractId = contractId;
    }

    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    public List<Long> getContractId() {
        return contractId;
    }

    public void setContractID(List<Long> contractId) {
        this.contractId = contractId;
    }
}
