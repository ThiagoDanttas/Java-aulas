package entities;

public class Account {

    private int number;
    private String holder;
    private double balance;

    // Constructors
    public Account(){
    }

    public Account(int numberAccount, String name){
        this.number = numberAccount;
        this.holder = name;
    }

    public Account(int numberAccount, String name, double initialDeposit){
        this.number = numberAccount;
        this.holder = name;
        this.deposit(initialDeposit);
    }

    // Getters & Setters
    public int getNumberAccount() {return number;}

    public String getName() {return holder;}

    public void setName(String name) {this.holder = name;}

    public double getAmount() {return balance;}

    public double getBalance(){return this.balance;}

   // Methods
    public void deposit(double amount){
        this.balance += amount;
    }

    public void withdraw(double amount){
        this.balance -= amount + 5.00;
    }

    public String toString(){
        return "Account "
                + number
                + ", Holder: "
                + holder
                + ", Balance: $"
                + String.format("%.2f", balance);
    }

}
