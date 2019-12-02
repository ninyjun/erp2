package com.ninyjun.erp.customer.custsdk.model;

import java.util.List;

public class CustomerDTO {
    private Customer customer;
    private List<CustomerAddress> customerAddress;

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public List<CustomerAddress> getCustomerAddress() {
        return customerAddress;
    }

    public void setCustomerAddress(List<CustomerAddress> customerAddress) {
        this.customerAddress = customerAddress;
    }

    public List<CustomerExtra> getCustomerExtra() {
        return customerExtra;
    }

    public void setCustomerExtra(List<CustomerExtra> customerExtra) {
        this.customerExtra = customerExtra;
    }

    public List<CustomerComminfo> getCustomerComminfo() {
        return customerComminfo;
    }

    public void setCustomerComminfo(List<CustomerComminfo> customerComminfo) {
        this.customerComminfo = customerComminfo;
    }

    private List<CustomerExtra> customerExtra;
    private List<CustomerComminfo> customerComminfo;
}
