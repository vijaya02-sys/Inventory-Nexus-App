public class Main {
    public static void main(String[] args)
    {
        System.out.println("INVENTORY NEXUS!");

        Inventory p = new Inventory();
        System.out.println(p);

        InventoryNexusAccess access = new InventoryNexusAccess();

        // Hey access, add the inventories

        access.addInventory(new Inventory("Asus Vivobook", "Laptop", "Brown Drawer", 2022));
        access.addInventory(new Inventory("Type C", "Cable", "Black Drawer", 2024));
        access.addInventory(new Inventory("Mac Studio", "Computer", "White Table", 2025));
        access.addInventory(new Inventory("Focusrite Mixer", "Audio System", "WhiteTable", 2025));
        access.addInventory(new Inventory("Asus Rag", "Laptop", "Brown Table", 2021));
        access.addInventory(new Inventory("Macbook Pro", "Laptop", "Brown Drawer", 2022));
        access.addInventory(new Inventory("Wacom Pad", "Writing Pad", "Black Drawer", 2020));
        access.addInventory(new Inventory("Apple Keyboard", "Keyboard", "White Table", 2022));
        access.addInventory(new Inventory("Logitech Keyboard", "Keyboard", "Black Table", 2024));
        access.addInventory(new Inventory("Hdmi cable", "Cable", "Black Drawer", 2024));
        access.addInventory(new Inventory("Java Black Book", "Cable", "Shelf", 2024));
        access.addInventory(new Inventory("Logi Mouse", "Mouse", "Black Table", 2022));
        access.addInventory(new Inventory("Apple Mouse", "Mouse", "White Table", 2022));
        access.addInventory(new Inventory("Lenovo Mouse", "Mouse", "Black Drawer", 2022));
        access.addInventory(new Inventory("BlackBeast", "Computer", "White Table", 2022));
    }
}