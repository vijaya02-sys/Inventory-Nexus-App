package com.javaprojects.InventoryNexusWeb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.sql.SQLException;
import java.util.List;

@Component
public class InventoryNexusAccess
{

    @Autowired
    InventoryNexusDB db;

//    public InventoryNexusAccess() throws SQLException, ClassNotFoundException {
//    }
//

    public void  addInventory(Inventory inventory) throws SQLException {
//        inventories.add(inventory);

        db.save(inventory);
    }

    public List<Inventory> getAllInventories() throws SQLException {
//        return inventories;

        return db.findAll();
    }

    public Inventory getInventory(String name) throws SQLException {
//        for(Inventory inventory : inventories)
//        {
//            if(inventory.getName().equals(name))
//            {
//                return inventory;
//            }
//        }
//
//        return null;

        return db.findByName(name);
    }


}
