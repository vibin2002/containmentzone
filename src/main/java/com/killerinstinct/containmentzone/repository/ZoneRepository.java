package com.killerinstinct.containmentzone.repository;

import com.killerinstinct.containmentzone.model.Zone;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ZoneRepository extends JpaRepository<Zone,Integer> {

    List<Zone> findByPincode(int pincode);

}

