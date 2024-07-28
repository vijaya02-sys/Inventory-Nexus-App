package com.javaprojects.InventoryNexusWeb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.sql.SQLException;
import java.util.List;

@RestController
public class InventoryNexusController
{
    @Autowired
    InventoryNexusAccess access;

    // HEY! THIS IS FOR INVENTORY REQUEST
    @GetMapping("/inventories")
    public List<Inventory> getAllInvetories() throws SQLException {
        return access.getAllInventories();
    }

    @GetMapping("/inventory/{name}")
    public Inventory getInventory(@PathVariable String name) throws SQLException {
        return access.getInventory(name);
    }

    @PostMapping("/inventory")
    public void addInventory(@RequestBody Inventory inventory) throws SQLException
    {
        access.addInventory(inventory);
    }
}
