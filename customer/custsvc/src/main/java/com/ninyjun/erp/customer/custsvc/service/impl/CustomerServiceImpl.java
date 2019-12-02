package com.ninyjun.erp.customer.custsvc.service.impl;

import com.ninyjun.erp.customer.custsdk.model.*;
import com.ninyjun.erp.customer.custsvc.repository.*;
import com.ninyjun.erp.customer.custsvc.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerMapper custRepo;

    @Autowired
    private CustomerAddressMapper custAddrRepo;

    @Autowired
    private CustomerComminfoMapper custComminfoRepo;

    @Autowired
    private CustomerExtraMapper custExtraRepo;

    @Autowired
    private CustomerVipMapper custVipRepo;

    @Override
    public CustomerDTO getByCustId(Long custId) {
        Customer cust = custRepo.selectByPrimaryKey(custId);
        CustomerDTO dto = new CustomerDTO();
        if (cust != null){
            List<CustomerAddress> addrs = custAddrRepo.selectByCustId(custId);
            if (addrs != null)
                dto.setCustomerAddress(addrs);

            List<CustomerExtra> extras = custExtraRepo.selectByCustId(custId);
            if (extras != null)
                dto.setCustomerExtra(extras);

            List<CustomerComminfo> comms = custComminfoRepo.selectByCustId(custId);
            if (comms != null)
                dto.setCustomerComminfo(comms);
        }

        return dto;
    }
}
