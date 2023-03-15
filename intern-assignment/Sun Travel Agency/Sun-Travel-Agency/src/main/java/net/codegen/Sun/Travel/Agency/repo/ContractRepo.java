package net.codegen.Sun.Travel.Agency.repo;

import net.codegen.Sun.Travel.Agency.model.Contract;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface ContractRepo extends JpaRepository<Contract, Long> {
    List <Contract> findByContractIdIn(List <Long> contractId);


}
