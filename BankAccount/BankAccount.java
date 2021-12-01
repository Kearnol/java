import java.lang.Math;

public class BankAccount{
    private double checkingBalance;
    private double savingsBalance;
    private String accountNumber;
    private static int accounts = 0;
    private static float allBalances = 0;

    //===============
    // constructor
    //===============
    public BankAccount(double checking, double savings){
        checkingBalance = checking;
        savingsBalance = savings;
        accounts ++;
        allBalances += checking + savings;
        accountNumber = createActNum();
    }

    //==============
    //methods
    //==============
    private String createActNum(){
        String acctNum = "";
        for(int i = 0; i<10; i++){
            int digit = (int) Math.rint(Math.random()*10);
            acctNum += digit;
        }
        return acctNum;
    }
    
    public BankAccount addToSavings(double deposit){
        savingsBalance = deposit;
        allBalances += deposit;
        return this;
    }

    public BankAccount addToChecking(double deposit){
        checkingBalance = deposit;
        allBalances += deposit;
        return this;
    }

    public BankAccount withdrawChecking(double withdraw){
        if (checkingBalance < withdraw){
            System.out.println("Insefficient Funds. Account Balance:" + checkingBalance);
            return this;
        }
        else{
            checkingBalance -= withdraw;
            allBalances -= withdraw;
            System.out.printf("Withrdew $%.2f. New Account Balance: $%2$d", withdraw, checkingBalance);
        }
        return this;
    }

    public BankAccount withdrawSavings(double withdraw){
        if (savingsBalance < withdraw){
            System.out.println("Insefficient Funds. Account Balance:" + savingsBalance);
            return this;
        }
        else{
            savingsBalance -= withdraw;
            allBalances -= withdraw;
            System.out.printf("Withrdew $%.2f. New Account Balance: $%2$.2f", withdraw, savingsBalance);
        }
        return this;
    }

    //==============
    //getters & setters
    //==============
    public double getAccounts(){
        return accounts;
    }
    public double getAllBalances(){
        return allBalances;
    }

    public String getAccountNumber(){
        return accountNumber;
    }

    public double getCheckingBalance(){
        return checkingBalance;
    }

    public double getSavingsBalance(){
        return savingsBalance;
    }


}