public class BankAccount {
    private int accountNumber;
    private String accountHolderName;
    private double balance;
    private char accountType;
    private boolean isActive;
    private long phoneNumber;
    static String bankName;
    private static int totalAccounts;

    static{
        bankName = "HDFC Bank";
        totalAccounts = 0;
        System.out.println("Bank System Initialised");
    }
    // Constructors
    BankAccount(){
        isActive = true;
        balance = 0;
        totalAccounts++;
    }
    BankAccount(int accountNumber, String accountHolderName, char accountType, long phoneNumber){
        this();
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.accountType = accountType;
        this.phoneNumber = phoneNumber;
    }
    // Getters Setters
    public int getAccountNumber() {
        return accountNumber;
    }
    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }
    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        if (balance < 0)
            System.out.println("Error: Balance cannot be negative");
        else
            this.balance = balance;
    }

    public char getAccountType() {
        return accountType;
    }
    public void setAccountType(char accountType) {
        if (accountType == 'S' || accountType == 'C')
            this.accountType = accountType;
        else System.out.println("Error: Only 'S' and 'C' are acceptable");

    }

    public boolean isActive() {
        return isActive;
    }
    public void setActive(boolean isActive) {
        this.isActive = isActive;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }
    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    // display method
    public void displayBankAccountDetails() {
        System.out.println("----------------------------");
        System.out.println("Account Number : " + accountNumber);
        System.out.println("Account Holder Name : " + accountHolderName);
        System.out.printf("Account Balance : %.2f%n", balance);
        System.out.println("Account Type : " + accountType);
        System.out.println("Account isActive : " + isActive);
        System.out.println("Phone Number : " + phoneNumber);
        System.out.println("------------------------------");
    }
    
    // deposit method
    public void deposit(double amount){
        System.out.println("Starting Deposit");
        balance+=amount;
    };
    public void deposit(double amount, String description){
        this.deposit(amount);
        System.out.println("Deposit Msg : " + description);
    };

    // withdraw method
    public void withdraw(double amount){
        System.out.println("Starting Deduction");
        if(isActive && balance>=amount){
            balance-=amount;
        }
        else System.out.println("Error: No sufficient Funds.");
    };
    public void withdraw(double amount, String reason){
        this.withdraw(amount);
        System.out.println("Withdraw Reason : " + reason);
    };

    // Get Bank Info
    public static void getBankInfo(){
        System.out.println("Bank Name : " + bankName);
        System.out.println("Total Accounts in Bank : " + totalAccounts);
    }
}
