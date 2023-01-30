import java.util.ArrayList;

public class BankAccount {
    private String AccountNumber = "";
    private String accountType = "";
    private float balance = 0.0f;
    private ArrayList<Transaction> alTransaction = new ArrayList<Transaction>();

    public float Deposit(float amount){
        this.balance += amount;
        alTransaction.add(new Transaction("Deposit", amount, "Adding: " + amount));
        return this.balance;
    }

    public float Withdrawal(float amount){
        if (this.balance > 0 ){
            this.balance -= amount;
            alTransaction.add(new Transaction("withdrawing", amount, "Substracting: " + amount));
            return this.balance;
        }else{
            System.out.println("Not enough balance");
        }
        return amount;
    }

    public void ViewBalance(){
        System.out.println("Balance of the account: " + balance);
    }

    public BankAccount() {
    }

    public BankAccount(String accountNumber, String accountType, float balance) {
        AccountNumber = accountNumber;
        this.accountType = accountType;
        this.balance = balance;
    }

    public String getAccountNumber() {
        return AccountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        AccountNumber = accountNumber;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }

    public ArrayList<Transaction> getAlTransaction() {
        return alTransaction;
    }

    public void setAlTransaction(ArrayList<Transaction> alTransaction) {
        this.alTransaction = alTransaction;
    }
}
