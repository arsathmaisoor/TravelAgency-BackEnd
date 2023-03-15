package net.codegen.Sun.Travel.Agency.resource;

import net.codegen.Sun.Travel.Agency.model.RoomType;
import net.codegen.Sun.Travel.Agency.service.RoomTypeService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/roomType")
public class RoomTypeResource {
    private final RoomTypeService roomTypeService;
    public RoomTypeResource(RoomTypeService roomTypeService) {this.roomTypeService = roomTypeService;}

    @GetMapping("/all")
    public ResponseEntity<List<RoomType>> getAllRomTypes() {
        List<RoomType> roomTypes = roomTypeService.findAllRoomTypes();
        return new ResponseEntity<>(roomTypes, HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<RoomType> addRoomType(@RequestBody RoomType roomType) {
        RoomType newRoomType = roomTypeService.addRoomType(roomType);
        return new ResponseEntity<>(newRoomType,HttpStatus.CREATED);
    }

    /**
     *
     * @param roomType
     * @return
     */
    @PutMapping("/update")
    public ResponseEntity<RoomType> updateRoomType(@RequestBody RoomType roomType) {
        RoomType updateRoomType = roomTypeService.updateRoomType(roomType);
        return new ResponseEntity<>(updateRoomType,HttpStatus.CREATED);
    }


}
