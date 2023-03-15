package net.codegen.Sun.Travel.Agency.repo;

import net.codegen.Sun.Travel.Agency.model.Hotel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import net.codegen.Sun.Travel.Agency.dto.ContractDto;
@Repository
public interface HotelRepo extends JpaRepository<Hotel, Long> {

         Hotel findByHotelId(Long hotelId);
         void deleteByHotelId(Long HotelId);




}
