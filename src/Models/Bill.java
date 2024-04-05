package Models;

import Stratergies.BillingStratergy;

import java.time.LocalDateTime;
import java.util.List;

public class Bill {
    private LocalDateTime exitTime;
    private Ticket ticket;
    private float billAmount;
    private BillingStatus billingStatus;
    private List<Payment> payment;
    private Gate exitGate;
    private Operator operator;

    private BillingStratergy billingStratergy;

    public LocalDateTime getExitTime() {
        return exitTime;
    }

    public void setExitTime(LocalDateTime exitTime) {
        this.exitTime = exitTime;
    }

    public Ticket getTicket() {
        return ticket;
    }

    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }

    public float getBillAmount() {
        return billAmount;
    }

    public void setBillAmount(float billAmount) {
        this.billAmount = billAmount;
    }

    public BillingStatus getBillingStatus() {
        return billingStatus;
    }

    public void setBillingStatus(BillingStatus billingStatus) {
        this.billingStatus = billingStatus;
    }

    public List<Payment> getPayment() {
        return payment;
    }

    public void setPayment(List<Payment> payment) {
        this.payment = payment;
    }

    public Gate getExitGate() {
        return exitGate;
    }

    public void setExitGate(Gate exitGate) {
        this.exitGate = exitGate;
    }

    public Operator getOperator() {
        return operator;
    }

    public void setOperator(Operator operator) {
        this.operator = operator;
    }

    public BillingStratergy getBillingStratergy() {
        return billingStratergy;
    }

    public void setBillingStratergy(BillingStratergy billingStratergy) {
        this.billingStratergy = billingStratergy;
    }
}
