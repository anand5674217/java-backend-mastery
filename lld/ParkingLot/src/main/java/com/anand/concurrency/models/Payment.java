package com.anand.concurrency.models;

import java.math.BigDecimal;
import java.util.Date;

public class Payment extends BaseModel {

    private Date paymentTime;
    private BigDecimal amount;
    private PaymentMode paymentMode;
    private Bill bill;
    private String refNo;
    private PaymentStatus paymentStatus;

    public Date getPaymentTime() {
        return paymentTime == null ? null : new Date(paymentTime.getTime());
    }

    public void setPaymentTime(Date paymentTime) {
        this.paymentTime = paymentTime == null ? null : new Date(paymentTime.getTime());
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public PaymentMode getPaymentMode() {
        return paymentMode;
    }

    public void setPaymentMode(PaymentMode paymentMode) {
        this.paymentMode = paymentMode;
    }

    public Bill getBill() {
        return bill;
    }

    public void setBill(Bill bill) {
        this.bill = bill;
    }

    public String getRefNo() {
        return refNo;
    }

    public void setRefNo(String refNo) {
        this.refNo = refNo;
    }

    public PaymentStatus getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(PaymentStatus paymentStatus) {
        this.paymentStatus = paymentStatus;
    }
}
