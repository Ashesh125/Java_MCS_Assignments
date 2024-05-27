package assignment_2.Q5;

public class Account {
    private String id;
    private String name;
    private int balance = 0;

    Account(String id, String name) {
        this.id = id;
        this.name = name;
    }

    Account(String id, String name, int balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getBalance() {
        return balance;
    }

    public int credit(int amount) {
        balance += amount;
        System.out.println(String.format("Depositing %d by %s", amount, name));

        return balance;
    }

    public int debit(int amount) {
        System.out.println(String.format("Withdrawing %d by %s", amount, name));
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Not Enough Balance!!!!");
        }

        return balance;
    }

    public int transfer(Account another, int amount) {
        if (amount <= balance) {
            this.debit(amount);
            another.credit(amount);
        } else {
            System.out.println("Not Enough Balance!!!!");
        }

        return balance;
    }

    @Override
    public String toString() {
        return String.format("Account[id=%s, name= %s, balance=%d]", id, name, balance);
    }
}
