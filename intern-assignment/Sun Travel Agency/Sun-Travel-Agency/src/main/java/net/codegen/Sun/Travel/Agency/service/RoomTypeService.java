package net.codegen.Sun.Travel.Agency.service;

import jakarta.transaction.Transactional;
import net.codegen.Sun.Travel.Agency.model.RoomType;
import net.codegen.Sun.Travel.Agency.repo.RoomTypeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoomTypeService {
    private final RoomTypeRepo roomTypeRepo;

    @Autowired
    public RoomTypeService(RoomTypeRepo roomTypeRepo) {this.roomTypeRepo = roomTypeRepo;}

    public RoomType addRoomType(RoomType roomType) {
        return  roomTypeRepo.save(roomType);
    }

    public List<RoomType> findAllRoomTypes() {return roomTypeRepo.findAll();}

    public  RoomType updateRoomType(RoomType roomType) {return roomTypeRepo.save(roomType);}


}
