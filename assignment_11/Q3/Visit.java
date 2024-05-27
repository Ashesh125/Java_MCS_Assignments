public class Visit {
    private Customer customer;
    private double cp;
    private double sp;

    public Visit(Customer customer, double productsCost, double servicesCost) {
        this.customer = customer;
        this.cp = productsCost;
        this.sp = servicesCost;
    }

    public double getTotalBill() {
        return Discount.computeTotalBill(customer, cp, sp);
    }
}
