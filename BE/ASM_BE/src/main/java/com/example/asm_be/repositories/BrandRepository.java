package com.example.asm_be.repositories;

import com.example.asm_be.entities.Bill;
import com.example.asm_be.entities.Brands;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;
@Repository
public interface BrandRepository extends JpaRepository<Brands, Integer> {
}