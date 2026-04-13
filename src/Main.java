public class Main {
    public static void main(String[] args){
        // This is the Main Java file where we implement the Banking System

        // Model a bank Account
        BankAccount myBankAccount = new BankAccount();
        myBankAccount.setAccountNumber(10001);
        myBankAccount.setAccountHolderName("Bannoth Trishul Naik");
        myBankAccount.setBalance(32_000.00);
        myBankAccount.setAccountType('C');
        myBankAccount.setActive(true);
        myBankAccount.setPhoneNumber(8127842321L);
        // myBankAccount.displayBankAccountDetails();

        BankAccount myBankAccount2 = new BankAccount();
        BankAccount myBankAccount3 = new BankAccount(10001, "Bannoth Rahul Naik", 'S', 7093604498L);
        myBankAccount3.displayBankAccountDetails();
        myBankAccount3.deposit(1000, "saving");
        myBankAccount3.withdraw(2000);
        System.out.println("Balance : " + myBankAccount3.getBalance());
        

        // Arrays
        BankAccount[] accounts = new BankAccount[3];
        accounts[0] = new BankAccount(1001, "Trishul", 'S', 7093604498L);
        accounts[1] = new BankAccount(1002, "Rahul", 'S', 7093604498L);
        accounts[2] = new BankAccount(1003, "Goutham", 'S', 7093604498L);


        for(BankAccount acc : accounts){
            acc.setBalance(Math.random()*100000);
            acc.displayBankAccountDetails();
        }


        double maxBalance =0;
        int maxBalanceIndex = 0;
        for(int i=0;i<accounts.length;i++){
            if(accounts[i].getBalance()>maxBalance){
                maxBalance=accounts[i].getBalance();
                maxBalanceIndex=i;
            }
        }
        System.out.println("Max Balance Account : ");
        accounts[maxBalanceIndex].displayBankAccountDetails();
        myBankAccount3.bankName = "SBI";

        // Anonymous Obj
        new BankAccount().deposit(30000);

        BankAccount.getBankInfo();
    }

}
