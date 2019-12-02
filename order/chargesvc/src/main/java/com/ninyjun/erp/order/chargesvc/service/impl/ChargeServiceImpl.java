package com.ninyjun.erp.order.chargesvc.service.impl;

import com.ninyjun.erp.order.chargesvc.repository.ChargeChannelMapper;
import com.ninyjun.erp.order.chargesvc.repository.ChargeExtraMapper;
import com.ninyjun.erp.order.chargesvc.repository.ChargeMapper;
import com.ninyjun.erp.order.chargesvc.service.ChargeService;
import com.ninyjun.erp.order.ordersdk.model.ChargeDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ChargeServiceImpl implements ChargeService {

    @Autowired
    ChargeMapper chargeRepo;

    @Autowired
    ChargeChannelMapper chargeChannelRepo;

    @Autowired
    ChargeExtraMapper chargeExtraRepo;



    @Override
    @Transactional( rollbackFor = Exception.class, timeout = 5000)
    public void charge(ChargeDTO charge){

         chargeRepo.insert(charge.getCharge());

    }
}
