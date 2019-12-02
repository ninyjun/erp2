package com.ninyjun.erp.inventory.inventorysvc.controller;

import com.ninyjun.erp.common.httpresult.CodeMessage;
import com.ninyjun.erp.common.httpresult.HttpResult;
import com.ninyjun.erp.inventory.inventorysdk.model.InventoryInoutDTO;
import com.ninyjun.erp.inventory.inventorysvc.service.InventoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class InventoryController {

    @Autowired
    InventoryService inventorySvc;

    @PostMapping(value = "/v1/inventory/product/inventory", produces = "application/json;charset=utf-8")
    @ResponseBody
    public HttpResult<InventoryInoutDTO> inventoryInout(@RequestBody InventoryInoutDTO inv) {


        return HttpResult.success(inv);
    }
}
