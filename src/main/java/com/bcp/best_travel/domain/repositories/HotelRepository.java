package com.bcp.best_travel.domain.repositories;

import com.bcp.best_travel.domain.entities.HotelEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HotelRepository extends JpaRepository<HotelEntity,Long> {


}
