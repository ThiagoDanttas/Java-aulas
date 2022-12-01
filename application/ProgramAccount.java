package application;

import entities.Account2;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class ProgramAccount {

    public static void main(String[] args){

        Account2 acc = new Account2(1001, "Alex", 0.0);
        BusinessAccount bacc = new BusinessAccount(1002, "Maria", 0.0, 500.0);

        // UPCASTING (subclass to super class)
        Account2 acc1 = bacc;
        Account2 acc2 = new BusinessAccount(1003, "Bob", 0.0, 200.0);
        Account2 acc3 = new SavingsAccount(1004, "Ana", 0.0, 0.01);

        // DOWNCASTING (super class to subclass)
        BusinessAccount acc4 = (BusinessAccount) acc2;


        if(acc3 instanceof SavingsAccount){
            BusinessAccount acc5 = (BusinessAccount) acc3;
            acc5.loan(500.0);
        }

    }


}
