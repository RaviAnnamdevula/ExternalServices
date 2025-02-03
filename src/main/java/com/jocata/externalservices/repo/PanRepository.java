package com.jocata.externalservices.repo;


import com.jocata.externalservices.entities.PanDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PanRepository extends JpaRepository<PanDetails, String> {
    PanDetails findByPanNo(String no);
}
