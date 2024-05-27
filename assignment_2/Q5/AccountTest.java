package assignment_2.Q5;

public class AccountTest {
    public static void main(String[] args) {
        Account acc1 = new Account("100", "Ram");
        System.out.println(acc1);
        acc1.credit(25000);
        System.out.println("Current Balance of " + acc1.getName() + ": " + acc1.getBalance());
        acc1.debit(12000);
        System.out.println("Current Balance of " + acc1.getName() + ": " + acc1.getBalance());
        acc1.debit(15000);
        System.out.println("Current Balance of " + acc1.getName() + ": " + acc1.getBalance());

        System.out.println("");
        Account acc2 = new Account("101", "Hari", 40000);
        System.out.println(acc2);
        System.out.println("Current Balance of " + acc2.getName() + ": " + acc2.getBalance());
        acc2.credit(15000);
        System.out.println("Current Balance of " + acc2.getName() + ": " + acc2.getBalance());
        acc2.transfer(acc1, 35000);
        System.out.println("Current Balance of " + acc2.getName() + ": " + acc2.getBalance());
        System.out.println("Current Balance of " + acc1.getName() + ": " + acc1.getBalance());
    }
}
