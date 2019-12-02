package com.ninyjun.erp.inventory.inventorysdk.api;

import com.alibaba.fastjson.JSON;
import com.ninyjun.erp.common.httpresult.HttpResult;
import com.ninyjun.erp.common.svcclient.SvcClientBase;
import com.ninyjun.erp.inventory.inventorysdk.model.Inventory;
import com.ninyjun.erp.inventory.inventorysdk.model.InventoryInout;
import com.ninyjun.erp.inventory.inventorysdk.model.InventoryInoutDTO;

public class InventorySvcClient extends SvcClientBase {


    public InventorySvcClient() {
        this.setHttpSvc("inventorysvc","/");
    }

    public InventorySvcClient(String svcName) {
        this.setHttpSvc(svcName,"/");
    }

    public InventoryInoutDTO inventoryInout(InventoryInout invInout) {
        setUrl("/v1/inventory/product/inventory");


        InventoryInoutDTO dto = new InventoryInoutDTO();
        if (invInout.getAmount() < 0)
            dto.setInventoryIn(invInout);
        else
            dto.setInventoryOut(invInout);

        String repos = restTemp.postForObject(this.getApiUrl(),InventoryInoutDTO.class,String.class);

        HttpResult<InventoryInoutDTO>  httpdto = JSON.parseObject(repos,new HttpResult<InventoryInoutDTO>().getClass());

        return httpdto.getData();
    }
}
