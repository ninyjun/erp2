package com.ninyjun.erp.inventory.inventorysvc.service;

import com.ninyjun.erp.inventory.inventorysdk.model.Inventory;
import com.ninyjun.erp.inventory.inventorysdk.model.InventoryBatchNo;
import com.ninyjun.erp.inventory.inventorysdk.model.InventoryInout;
import com.ninyjun.erp.inventory.inventorysdk.model.InventoryInoutDTO;

public interface InventoryService {
    Inventory inventoryOut(InventoryInout inout);
    Inventory inventoryIn(InventoryInout inout);
}
