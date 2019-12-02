package com.ninyjun.erp.inventory.inventorysdk.model;

import java.util.List;

public class InventoryInoutDTO {
    private Inventory inventory;

    public InventoryInoutDTO() {
    }

    public InventoryInoutDTO(Inventory inventory) {
        this.inventory = inventory;
    }

    public Inventory getInventory() {
        return inventory;
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }


    public List<InventoryInoutRel> getInventoryInoutRels() {
        return inventoryInoutRels;
    }

    public void setInventoryInoutRels(List<InventoryInoutRel> inventoryInoutRels) {
        this.inventoryInoutRels = inventoryInoutRels;
    }

    public InventoryInout getInventoryIn() {
        return inventoryIn;
    }

    public void setInventoryIn(InventoryInout inventoryIn) {
        this.inventoryIn = inventoryIn;
    }

    public InventoryInout getInventoryOut() {
        return inventoryOut;
    }

    public void setInventoryOut(InventoryInout inventoryOut) {
        this.inventoryOut = inventoryOut;
    }

    private InventoryInout inventoryIn;
    private InventoryInout inventoryOut;

    private List<InventoryInoutRel> inventoryInoutRels;
}
