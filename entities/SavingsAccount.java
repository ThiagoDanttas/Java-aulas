public class SavingsAccount extends Account2 {

    private double interestRate;

    public SavingsAccount(){
        super();
    }

    public SavingsAccount(Integer number, String holder, Double balance, double interestRate) {
        super(number, holder, balance);
        this.interestRate = interestRate;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    // Methods
    public void updateBalance(){
        balance += balance * this.interestRate;
    }

    @Override
    public void withdraw(double amount){
        balance -= amount;
    }

}
