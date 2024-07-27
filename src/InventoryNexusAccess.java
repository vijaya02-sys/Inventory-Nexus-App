import java.util.ArrayList;
import java.util.List;

public class InventoryNexusAccess
{
    List<Inventory> inventories = new ArrayList<Inventory>();

    public void  addInventory(Inventory inventory)
    {
        inventories.add(inventory);
    }
}
