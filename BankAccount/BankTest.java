public class BankTest{
    public static void main(String[] args){
        BankAccount account = new BankAccount(0.0, 0.0);
        account.addToChecking(25.0).addToSavings(10.0).withdrawSavings(12.0);
        System.out.println("Acct Number: " + account.getAccountNumber());
        System.out.println(account.getCheckingBalance());
        System.out.println(account.getSavingsBalance());
        System.out.println(account.getAccounts());
        System.out.println(account.getAllBalances());
    }
}