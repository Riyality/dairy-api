package com.dairy.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dairy.entity.Branch;
import com.dairy.entity.Equipment;

@Repository
public interface EquipmentRepository extends JpaRepository<Equipment, Integer>  {

	Optional<Equipment> findById(long id);

}
