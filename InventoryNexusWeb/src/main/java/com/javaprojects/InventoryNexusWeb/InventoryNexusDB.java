package com.javaprojects.InventoryNexusWeb;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InventoryNexusDB extends JpaRepository<Inventory, Integer>
{
    Inventory findByName(String name);
}
