package entities;

public class Account2 {

    private Integer number;
    private String holder;
    protected Double balance;

    // Constructor
    public Account2(){
    }

    public Account2(Integer number, String holder, Double balance){
        this.number = number;
        this.holder = holder;
        this.balance = balance;
    }

    // Getters & Setters

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public Double getBalance() {
        return balance;
    }

    // Methods

    public void withdraw(double amount){
        this.balance -= amount;
    }

    public void deposit(double amount){
        this.balance += amount;
    }

}
