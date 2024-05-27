package assignment_11.Q3;

public class Calc {
    public static void main(String[] args) {
        Customer customer1 = new Customer("John Doe", true, "Premium");
        Visit visit1 = new Visit(customer1, 100, 200);
        System.out.println("Total bill for " + customer1.getName() + ": $" + visit1.getTotalBill());

        Customer customer2 = new Customer("John Doe", false, "Premium");
        Visit visit2 = new Visit(customer2, 200, 300);
        System.out.println("Total bill for " + customer2.getName() + ": $" + visit2.getTotalBill());
    }
}
