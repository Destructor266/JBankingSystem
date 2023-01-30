import java.util.ArrayList;
import java.util.Scanner;

public class Customer {
    private String FirstName = "";
    private String LastName = "";
    private ArrayList<BankAccount> alBankAccount = new ArrayList<BankAccount>();

    public void BankAccountManagement(){
        int option = 0;
        String AccountNumber = "";
        String accountType = "";
        float balance = 0.0f;

        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to the bank account management system\n" +
                           "Select your option:\n" +
                            "1) Add account\n" +
                            "2) Delete account\n");
        option = sc.nextInt();
        switch (option){
            case 1:
                System.out.println("Insert Account number: ");
                AccountNumber = sc.next();
                System.out.println("Insert Account type: ");
                accountType = sc.next();
                alBankAccount.add(new BankAccount(AccountNumber, accountType, balance));
                System.out.println("Account created");
            case 2:
                System.out.println("Insert Account number: ");
                AccountNumber = sc.next();
                for (int i = 0; i < alBankAccount.size(); i++) {
                    if (AccountNumber.equals(alBankAccount.get(i).getAccountNumber())){
                        alBankAccount.remove(alBankAccount.get(i).getAccountNumber());
                    }
                }
                System.out.println("Account deleted");
        }
    }

    public void CustomerDetails(){
        for (int i = 0; i < alBankAccount.size(); i++) {
            System.out.println("Name of the customer: " + FirstName + LastName + "Bank account: " +
                               alBankAccount.get(i));
        }

    }

    public void TransactionHistory(){

        Scanner sc = new Scanner(System.in);

        System.out.println("Insert Account number: ");
        String AccountNumber = sc.next();
        for (int i = 0; i < alBankAccount.size(); i++) {
            if (AccountNumber.equals(alBankAccount.get(i).getAccountNumber())){
                String Date = alBankAccount.get(i).getAlTransaction().get(i).getDateAsString();
                float Amount = alBankAccount.get(i).getAlTransaction().get(i).getAmount();
                String TransactionType = alBankAccount.get(i).getAlTransaction().get(i).getTypeTransaction();
                String CompleteName = FirstName + LastName;
                String Description = alBankAccount.get(i).getAlTransaction().get(i).getDescription();
                System.out.println("Date: " + Date +
                                   "\nAmount: " + Amount +
                                   "\nType of the transaction: " + TransactionType +
                                   "\nAccount: " + CompleteName +
                                   "\nDescription: " + Description);
            }
        }
    }

    public Customer() {
    }

    public Customer(String firstName, String lastName) {
        FirstName = firstName;
        LastName = lastName;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public ArrayList<BankAccount> getAlBankAccount() {
        return alBankAccount;
    }

    public void setAlBankAccount(ArrayList<BankAccount> alBankAccount) {
        this.alBankAccount = alBankAccount;
    }
}
