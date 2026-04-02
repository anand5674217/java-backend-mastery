package com.anand.concurrency.models;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

public class Bill extends BaseModel {
    private Date exitTime;
    private Operator operator;
    private Gates gates;
    private Ticket ticket;
    private BigDecimal amount;
    private List<Payment> payments;

    public Date getExitTime() {
        return exitTime == null ? null : new Date(exitTime.getTime());
    }

    public void setExitTime(Date exitTime) {
        this.exitTime = exitTime == null ? null : new Date(exitTime.getTime());
    }

    public Operator getOperator() {
        return operator;
    }

    public void setOperator(Operator operator) {
        this.operator = operator;
    }

    public Gates getGates() {
        return gates;
    }

    public void setGates(Gates gates) {
        this.gates = gates;
    }

    public Ticket getTicket() {
        return ticket;
    }

    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public List<Payment> getPayments() {
        return payments;
    }

    public void setPayments(List<Payment> payments) {
        this.payments = payments;
    }
}
