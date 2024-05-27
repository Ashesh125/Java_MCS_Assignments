public class Account {
    private int accountNumber;
    private double balance;
    private double annualInterestRate;

    public int getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (canWithdraw(amount)) {
            balance -= amount;
            System.out.println("Withdrawal successful. New balance: Rs" + balance);
        } else {
            System.out.println("Insufficient Funds");
        }
    }

    public void showBalance() {
        System.out.println("Current Balance: Rs " + balance);
    }

    public boolean canWithdraw(double amount) {
        return (getBalance() - amount) >= 0;
    }

    class CheckingAccount extends Account {
        protected int overdraftLimit = -5000;

        @Override
        public boolean canWithdraw(double amount) {
            return (getBalance() - amount) >= overdraftLimit;
        }
    }

    class SavingsAccount extends Account {

    }

    public static void main(String[] args) {
        Account.CheckingAccount newCheckingAccount = new Account().new CheckingAccount();
        Account.SavingsAccount newSavingsAccount = new Account().new SavingsAccount();

        newCheckingAccount.deposit(50000);
        newCheckingAccount.showBalance();
        newCheckingAccount.withdraw(25000);
        newCheckingAccount.showBalance();
        newCheckingAccount.withdraw(25000);
        newCheckingAccount.showBalance();
        newCheckingAccount.withdraw(2500);
        newCheckingAccount.showBalance();
        newCheckingAccount.withdraw(5500);
        newCheckingAccount.showBalance();

        newSavingsAccount.deposit(12000);
        newSavingsAccount.showBalance();
        newSavingsAccount.withdraw(13000);
        newSavingsAccount.showBalance();
    }
}
