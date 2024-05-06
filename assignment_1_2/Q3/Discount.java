class Discount {
    private static final double SERVICE_PREMIUM = 0.20;
    private static final double SERVICE_GOLD = 0.15;
    private static final double SERVICE_SILVER = 0.10;
    private static final double PRODUCT_DISCOUNT = 0.10;

    public static double computeTotalBill(Customer customer, double productsCost, double servicesCost) {
        double totalBill = productsCost + servicesCost;

        if (customer.isMember()) {
            switch (customer.getMemberType()) {
                case "Premium":
                    totalBill -= servicesCost * SERVICE_PREMIUM;
                    break;
                case "Gold":
                    totalBill -= servicesCost * SERVICE_GOLD;
                    break;
                case "Silver":
                    totalBill -= servicesCost * SERVICE_SILVER;
                    break;
            }
        }

        totalBill -= productsCost * PRODUCT_DISCOUNT;

        return totalBill;
    }
}