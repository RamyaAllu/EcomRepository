package com.ecom.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ecom.beans.PhysicalCategory;

@Repository
public interface PhysicalCategoryRepository extends JpaRepository<PhysicalCategory, Integer> {

}