package assignment_2.Q4;

class InvoiceTest {
    public static void main(String[] args) {
        InvoiceItem inv1 = new InvoiceItem("123", "Apple", 4, 25);
        InvoiceItem inv2 = new InvoiceItem("124", "Banana", 12, 15.99);

        System.out.println(inv1);
        System.out.println("Unit price (" + inv1.getDesc() + "):" + inv1.getUnitPrice());
        System.out.println("Total price (" + inv1.getDesc() + "):" + inv1.getTotal());

        inv2.setUnitPrice(14.99);
        System.out.println(inv2);
        System.out.println("Unit price (" + inv2.getDesc() + "):" + inv2.getUnitPrice());
        System.out.println("Total price (" + inv2.getDesc() + "):" + inv2.getTotal());
    }
}