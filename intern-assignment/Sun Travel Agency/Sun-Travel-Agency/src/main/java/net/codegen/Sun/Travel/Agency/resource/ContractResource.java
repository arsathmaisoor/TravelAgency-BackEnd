package net.codegen.Sun.Travel.Agency.resource;

import net.codegen.Sun.Travel.Agency.service.ContractService;
import net.codegen.Sun.Travel.Agency.dto.ContractDto;
import net.codegen.Sun.Travel.Agency.model.Contract;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/contract")
public class ContractResource {
    @Autowired
    private final ContractService contractService;

    public ContractResource(ContractService contractService) {this.contractService = contractService;}

    @GetMapping("/all")
    public ResponseEntity<List<Contract>> getAllContracts() {
        List<Contract> contracts = contractService.findAllContracts();
        return new ResponseEntity<>(contracts, HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<Contract> addContract(@RequestBody ContractDto contractDto) {
        Contract newContract = contractService.addContract(contractDto);
        return new ResponseEntity<>(newContract,HttpStatus.CREATED);
    }

    @PutMapping("/update")
    public ResponseEntity<Contract> updateContract(@RequestBody Contract contract) {
        Contract updateContract = contractService.updateContract(contract);
        return new ResponseEntity<>(updateContract,HttpStatus.CREATED);
    }


}
