package com.jocata.externalservices.repo;

import com.jocata.externalservices.entities.AadhaarDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AadhaarRepository extends JpaRepository<AadhaarDetails, String> {
    AadhaarDetails findByUidNumber(String uidNumber);
}

