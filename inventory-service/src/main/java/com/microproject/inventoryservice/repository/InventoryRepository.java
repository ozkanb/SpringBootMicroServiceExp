package com.microproject.inventoryservice.repository;

import com.microproject.inventoryservice.model.Inventory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Optional;

public interface InventoryRepository extends JpaRepository<Inventory, Long> {
    @Query("Select p from Inventory p where p.skuCode = :skuCode")
    Optional<Inventory> findBySkuCode(@Param("skuCode") String skuCode);
}
