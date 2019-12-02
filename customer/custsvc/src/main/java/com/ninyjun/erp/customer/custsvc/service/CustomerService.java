package com.ninyjun.erp.customer.custsvc.service;

import com.ninyjun.erp.customer.custsdk.model.CustomerDTO;

public interface CustomerService {

   CustomerDTO getByCustId(Long custId);

}
