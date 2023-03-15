package net.codegen.Sun.Travel.Agency.service;

import jakarta.transaction.Transactional;
import net.codegen.Sun.Travel.Agency.repo.ContractRepo;
import net.codegen.Sun.Travel.Agency.dto.ContractDto;
import net.codegen.Sun.Travel.Agency.repo.HotelRepo;

import net.codegen.Sun.Travel.Agency.model.Contract;
import net.codegen.Sun.Travel.Agency.model.Hotel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContractService {
    @Autowired
    private final ContractRepo contractRepo;
    @Autowired
    private HotelRepo hotelRepo;



    @Autowired
    public ContractService(ContractRepo contractRepo) {this.contractRepo = contractRepo;}

    public Contract addContract(ContractDto contractDto) {

        //Find the relevant hotel using the hotelname


        Hotel hotel = hotelRepo.findByHotelId(contractDto.getHotelId());

        Contract contract = new Contract(hotel,contractDto.getFromDate(),contractDto.getToDate(),contractDto.getMarkUp(),contractDto.getRoomType());
        //BeanUtils.copyProperties(contractDto, contract);

        contract.setHotel(hotel);
        System.out.println("contract to be saved "+contract.toString());
        return contractRepo.save(contract);
    }

    public List<Contract> findAllContracts() {return contractRepo.findAll();}

    public Contract updateContract(Contract contract) {return contractRepo.save(contract);}


}