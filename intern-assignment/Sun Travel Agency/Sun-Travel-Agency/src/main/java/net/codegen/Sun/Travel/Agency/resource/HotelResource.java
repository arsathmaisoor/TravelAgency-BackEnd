package net.codegen.Sun.Travel.Agency.resource;

import net.codegen.Sun.Travel.Agency.service.HotelService;
import net.codegen.Sun.Travel.Agency.model.Hotel;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import net.codegen.Sun.Travel.Agency.dto.HotelDto;

import java.util.List;

@RestController
@RequestMapping("/hotel")
public class HotelResource {
    private final HotelService hotelService;

    public HotelResource(HotelService hotelService) {
        this.hotelService = hotelService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<Hotel>> getAllHotels() {
        List<Hotel> hotels = hotelService.findAllHotels();
        return new ResponseEntity<>(hotels, HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<Hotel> addHotel(@RequestBody HotelDto hotelDto) {
        Hotel newHotel = hotelService.addHotel(hotelDto);
        return new ResponseEntity<>(newHotel,HttpStatus.CREATED);
    }

    @PutMapping("/update")
    public ResponseEntity<Hotel> updateHotel(@RequestBody Hotel hotel) {
        Hotel updateHotel = hotelService.updateHotel(hotel);
        return new ResponseEntity<>(updateHotel,HttpStatus.CREATED);
    }


}
