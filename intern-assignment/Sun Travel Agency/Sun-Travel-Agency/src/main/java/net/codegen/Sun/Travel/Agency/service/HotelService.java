package net.codegen.Sun.Travel.Agency.service;

import jakarta.transaction.Transactional;
import net.codegen.Sun.Travel.Agency.repo.ContractRepo;
import net.codegen.Sun.Travel.Agency.dto.HotelDto;
import net.codegen.Sun.Travel.Agency.repo.HotelRepo;
import net.codegen.Sun.Travel.Agency.model.Hotel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class HotelService {
    @Autowired
    private final HotelRepo hotelRepo;
    @Autowired
    private ContractRepo contractRepo;


    @Autowired
    public HotelService(HotelRepo hotelRepo) {
        this.hotelRepo = hotelRepo;
    }

    public Hotel addHotel(HotelDto hotelDto) {

        //List <Contract> contract = contractRepo.findByContractIdIn(hotelDto.getContractId());
        Hotel hotel = new Hotel(hotelDto.getHotelName());
        //hotel.setContracts(contract);
        return hotelRepo.save(hotel);
    }

    public List<Hotel> findAllHotels() {
        return hotelRepo.findAll();
    }

    public Hotel updateHotel(Hotel hotel) {
        return hotelRepo.save(hotel);
    }

    @Transactional
    public void deleteHotel(Long hotelId) {
        hotelRepo.deleteByHotelId(hotelId);
    }
}
