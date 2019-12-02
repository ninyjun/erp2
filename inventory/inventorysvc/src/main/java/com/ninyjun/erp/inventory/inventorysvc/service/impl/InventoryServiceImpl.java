package com.ninyjun.erp.inventory.inventorysvc.service.impl;

import com.ninyjun.erp.inventory.inventorysdk.model.Inventory;
import com.ninyjun.erp.inventory.inventorysdk.model.InventoryBatchNo;
import com.ninyjun.erp.inventory.inventorysdk.model.InventoryInout;
import com.ninyjun.erp.inventory.inventorysdk.model.InventoryInoutDTO;
import com.ninyjun.erp.inventory.inventorysvc.repository.InventoryBatchNoMapper;
import com.ninyjun.erp.inventory.inventorysvc.repository.InventoryInoutMapper;
import com.ninyjun.erp.inventory.inventorysvc.repository.InventoryMapper;
import com.ninyjun.erp.inventory.inventorysvc.service.InventoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InventoryServiceImpl implements InventoryService {

    @Autowired
    InventoryMapper inventoryRepo;

    @Autowired
    InventoryInoutMapper inventoryInoutRepo;

    @Autowired
    InventoryBatchNoMapper inventoryBatchNoRepo;

    @Override
    public Inventory inventoryOut(InventoryInout inout) {

        Inventory inv = inventoryRepo.selectByPrimaryKey(inout.getInventoryId());
        if (inv == null)
            ;// throw

        InventoryBatchNo batchNo = inventoryBatchNoRepo.selectByPrimaryKey(inv.getInventoryBatchNoId());
        if (batchNo == null)
            ;// throw

        inout.setInventoryBatchNoId(batchNo.getInventoryBatchNoId());
        inout.setProductCode(inv.getProductCode());
        inout.setStorehouseCode(inv.getStorehouseCode());
        inout.setInoutType(inout.getAmount() < 0 ? 1 : 0);
        inout.setVersionNo(inv.getVersionNo());
        //需要生成主键
        //inout.setInventoryInoutId();

        //入库记录
        int ret = inventoryInoutRepo.insert(inout);

        //更新库存
        inv.setAmount(inout.getAmount());
        ret = inventoryRepo.updateAmountByPrimaryKey(inv);

        return inventoryRepo.selectByPrimaryKey(inout.getInventoryId());;
    }

    @Override
    public Inventory inventoryIn(InventoryInout inout) {
        return null;
    }
}
