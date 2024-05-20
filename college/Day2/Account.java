package college;

import java.util.Date;

class Account {
    private int accountNumber;
    private double balance;
    private Date transactionDate;
    private String customerName;

    public Account(int accountNumber, double balance, Date transactionDate, String customerName) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.transactionDate = transactionDate;
        this.customerName = customerName;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public Date getTransactionDate() {
        return transactionDate;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void deposit(double amount) {
        balance += amount;
        transactionDate = new Date();
        System.out.println(amount + " deposited successfully.");
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            transactionDate = new Date();
            System.out.println(amount + " withdrawn successfully.");
        } else {
            System.out.println("Insufficient balance. Cannot withdraw " + amount);
        }
    }
}

 class Main {
    public static void main(String[] args) {
        // Creating 5 account objects for different transactions
        Account account1 = new Account(1001, 5000.0, new Date(), "VIRAT KHOLI");
        Account account2 = new Account(1002, 3000.0, new Date(), "MAHENDRA SINGH DHONI");
        Account account3 = new Account(1003, 7000.0, new Date(), "SACHIN TENDULKAR");
        Account account4 = new Account(1004, 2000.0, new Date(), "RICKY PONTING");
        Account account5 = new Account(1005, 9000.0, new Date(), "ANDREW ROBERTS");

        // Performing transactions
        account1.deposit(1000.0);
        account2.withdraw(1500.0);
        account3.deposit(2000.0);
        account4.withdraw(3000.0);
        account5.deposit(500.0);

        // Displaying final balances
        System.out.println("Account " + account1.getAccountNumber() + " balance: " + account1.getBalance());
        System.out.println("Account " + account2.getAccountNumber() + " balance: " + account2.getBalance());
        System.out.println("Account " + account3.getAccountNumber() + " balance: " + account3.getBalance());
        System.out.println("Account " + account4.getAccountNumber() + " balance: " + account4.getBalance());
        System.out.println("Account " + account5.getAccountNumber() + " balance: " + account5.getBalance());
    }
}