package com.ninyjun.erp.order.ordersdk.model;

import java.util.List;

public class ChargeDTO {
    private Charge charge;
    private List<ChargeExtra> chargeExtra;
    private List<ChargePayVoucher> chargePayVoucher;

    public Charge getCharge() {
        return charge;
    }

    public void setCharge(Charge charge) {
        this.charge = charge;
    }

    public List<ChargeExtra> getChargeExtra() {
        return chargeExtra;
    }

    public void setChargeExtra(List<ChargeExtra> chargeExtra) {
        this.chargeExtra = chargeExtra;
    }

    public List<ChargePayVoucher> getChargePayVoucher() {
        return chargePayVoucher;
    }

    public void setChargePayVoucher(List<ChargePayVoucher> chargePayVoucher) {
        this.chargePayVoucher = chargePayVoucher;
    }

    public List<ChargeAcctBalanceRe> getChargeAcctBalanceRe() {
        return chargeAcctBalanceRe;
    }

    public void setChargeAcctBalanceRe(List<ChargeAcctBalanceRe> chargeAcctBalanceRe) {
        this.chargeAcctBalanceRe = chargeAcctBalanceRe;
    }

    private List<ChargeAcctBalanceRe> chargeAcctBalanceRe;

}
