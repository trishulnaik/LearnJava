public class Main {
    public static void main(String[] args){
        // This is the Main Java file where we implement the Banking System

        // Model a bank Account
        int accountNumber = 10001;
        String accountHolderName = "Bannoth Trishul Naik";
        double balance = 32000.00;
        char accountType = 'C';
        boolean isActive = true;
        long phoneNumber = 8127842321L;
        System.out.println("Account Number : " + accountNumber);
        System.out.println("Account Holder Name : " + accountHolderName);
        System.out.printf("Account Balance : %.2f%n", balance);
        System.out.println("Account Type : " + accountType);
        System.out.println("Account isActive : " + isActive);
        System.out.println("Phone Number : " + phoneNumber);

        // Literals Practice
        int accountPin = 0b1010;
        int branchCode = 0x1A3;
        long largeTransactionLimit = 1_00_00_000L;
        System.out.println("Account Pin : " + accountPin);
        System.out.println("Branch Code : " + branchCode);
        System.out.println("Transaction Limit : " + largeTransactionLimit);

        // Type Conversion & Casting
        float intrestRate = 50.5F;
        double intrestRateDouble = intrestRate;
        System.out.println(intrestRateDouble);
        int num = 12;
        byte num1 = (byte)num;
        System.out.println(num1);
        byte byte1 = 23;
        byte byte2 = 43;
        int result = byte1*byte2;
        System.out.println(result);

        // Opeartors
        double depositAmount = 1000;
        balance+=depositAmount;
        System.out.println("Balance After Deposit : " + balance);
        double withdrawalAmount = 1000;
        balance-=withdrawalAmount;
        System.out.println("Balance After Withdrawal : " + balance);
        double serviceChargeRate = 2.5;
        balance-=(balance*(serviceChargeRate/100));
        System.out.printf("Balance After Service Charge : %.2f%n", balance);
        // relational operators 
        if(balance>0){
            System.out.println("Balance is greater than 0");
        }
        int minimumBalance = 5000;
        if(balance>=minimumBalance){
            System.out.println("Balance is greater than 5000");
        }
        withdrawalAmount = 2000;
        if(isActive && balance>0){
            balance-=withdrawalAmount;
            System.out.println("2000 amount withdraw. Updated Balance : " + balance);
        }
        else {
            System.out.println("Cannot Withdraw");
        }
        System.out.println((withdrawalAmount<=balance)?"Sufficient Funds":"Insufficient Funds");

        // Pre/Post Increment
        int transactionCount = 0;
        int lastTransactionId = transactionCount++;
        int nextTransactoinId = ++transactionCount;
        System.out.println(transactionCount);
        System.out.println(lastTransactionId);
        System.out.println(nextTransactoinId);
        // Conditional Statements
        if(balance > 1_00_000){
            System.out.println("VIP Account");
        }
        else if(balance > 1_000){
            System.out.println("Regular Account");
        }
        else 
            System.out.println("Minimum Balance Warning");


        // switch 
        switch(accountType){
            case 'S':
                System.out.println("Saving Account - 4% interest");
                break;
            case 'C':
                System.out.println("Current Account - No interest");
                break;
            default:
                System.out.println("No interest");


        }
        // Loops
        for(int i=1;i<=5;i++){
            System.out.println("Transaction "+i);
        }
        double monthlyDeductions = 1000;
        while(balance>minimumBalance){
            balance-=monthlyDeductions;
        }
        System.out.println("Balance after monthly Deductions : " + balance);
        byte selection = 0;
        do{
            System.out.println("1. Deposit  2. Withdraw  3. Check Balance  4. Exit");
            selection++;
            System.out.println("You have selected : " + selection);
        }while(selection!=4);
        byte b = (byte)200;
        System.out.println("byte : " +b);
    }

}
