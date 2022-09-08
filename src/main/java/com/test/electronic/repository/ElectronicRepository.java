package com.test.electronic.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.test.electronic.electronics.Electronics;

public interface ElectronicRepository extends JpaRepository<Electronics ,Integer> {


}
