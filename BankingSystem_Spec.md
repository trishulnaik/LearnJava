# Day 1 Tasks — Java Banking System

> **Goal:** Solidify Day 1 Java fundamentals by implementing the foundational layer of a banking system — account data, type safety, and basic I/O logic.

---

## 1. Project Setup

- [x] Create a new Java project (e.g., `BankingSystem/`)
- [x] Set up the folder structure: `src/`, `README.md`, `SPEC.md`
- [x] Create the main entry file: `src/Main.java` with a `public static void main(String[] args)` method
- [x] Add a header comment in `Main.java` explaining what the project is

---

## 2. Variables & Data Types — Model a Bank Account

- [x] Declare and initialise the following variables to represent a bank account:
  - `int accountNumber` — a unique account ID (e.g., `10001`)
  - `String accountHolderName` — customer name
  - `double balance` — current balance (use `double` for precision)
  - `char accountType` — `'S'` for Savings, `'C'` for Current
  - `boolean isActive` — whether the account is active
  - `long phoneNumber` — customer phone number (use `long`, not `int` — why?)
  
    Ans:  because custom phone numbers can go out of int range which is 4 bytes
- [x] Print all values using `System.out.println()`
### Claude suggestion after implementation
prefer `%n` over `\n` in printf as it's platform-independent

---

## 3. Literals Practice

- [x] Declare `int accountPin` using a **binary literal** (e.g., `0b1010`)
- [x] Declare `int branchCode` using a **hex literal** (e.g., `0x1A3`)
- [x] Declare `long largeTransactionLimit` using **underscore notation** (e.g., `1_000_000`)
- [x] Print all three and verify output matches expected decimal values

---

## 4. Type Conversion & Casting

- [x] Demonstrate **implicit conversion**: assign a `float` interest rate into a `double`
- [x] Demonstrate **explicit casting**: truncate a `double` balance into an `int` (e.g., for display without decimals) — note the data loss
- [x] Try assigning an `int` into a `byte` — observe the compiler error, then fix it with a cast
- [x] Demonstrate **type promotion**: multiply two `byte` values (e.g., tax rate × flat fee) and store in an `int`

---

## 5. Operators — Transaction Logic

- [x] Use arithmetic operators to:
  - [x] Add a deposit amount to `balance` using `+=`
  - [x] Subtract a withdrawal using `-=`
  - [x] Calculate a 2.5% service charge using `/` and `*`
- [x] Use relational operators to:
  - [x] Check if `balance > 0`
  - [x] Check if `balance >= minimumBalance`
- [x] Use logical operators to:
  - [x] Check if account `isActive && balance > 0` before allowing withdrawal
  - [x] Use ternary operator to print `"Sufficient funds"` or `"Insufficient funds"`

---

## 6. Pre/Post Increment — Transaction Counter

- [x] Declare `int transactionCount = 0`
- [x] Simulate **post-increment**: capture the count before incrementing (e.g., assign to a `lastTransactionId`)
- [x] Simulate **pre-increment**: increment first, then use the value
- [x] Print both to verify the difference

---

## 7. Conditional Statements — Account Operations Menu

- [x] Write an `if-else if-else` block that:
  - [x] Prints `"VIP Account"` if `balance > 100000`
  - [x] Prints `"Regular Account"` if `balance > 1000`
  - [x] Prints `"Minimum Balance Warning"` otherwise
- [x] Write a `switch` statement on `accountType`:
  - [x] `'S'` → print `"Savings Account - 4% interest"`
  - [x] `'C'` → print `"Current Account - No interest"`
  - [x] `default` → print `"Unknown Account Type"`
  - [x] Ensure all `case` blocks have `break` statements

---

## 8. Loops — Mini Statement Generator

- [x] Use a `for` loop to simulate printing the last 5 transactions (use dummy values)
- [x] Use a `while` loop to keep deducting a fixed monthly fee until balance drops below minimum
- [x] Use a `do-while` loop to display a menu at least once:
  - Options: `1. Deposit  2. Withdraw  3. Check Balance  4. Exit`
  - Loop until user "selects" `4` (hardcode the selection for now — Scanner comes in Day 2)

---

## Bonus Challenges

- [x] What happens when `byte b = 200`? Write the code, observe the overflow, and add a comment explaining why
- [x] Can you store `3.14` in a `float` without the `f` suffix? Try it and note the compiler error

type double cannot be converted to type float. so put 3.14f


- [x] Write a single line using the ternary operator to check if a transaction amount is valid (positive and within daily limit)

---

## Done? Commit with message:
```
Day 1: Java fundamentals - variables, types, operators, conditionals, loops
```

---
 
---
 
# Day 2 Tasks — Object Oriented Programming
 
> **Goal:** Apply OOP fundamentals to the banking system — model accounts as proper objects with encapsulation, constructors, static members, and arrays.
 
---
 
## 1. Classes & Objects — Model a Bank Account
 
- [x] Create a new file `src/BankAccount.java`
- [x] Define a `BankAccount` class with these fields:
  - `int accountNumber`
  - `String accountHolderName`
  - `double balance`
  - `char accountType` — `'S'` for Savings, `'C'` for Current
  - `boolean isActive`
  - `long phoneNumber`
- [x] In `Main.java`, create an instance: `BankAccount acc = new BankAccount();`
- [x] Set each field directly and print them — confirm you can access object properties
 
---
 
## 2. Encapsulation — Getters & Setters
 
- [x] Make all fields in `BankAccount` **private**
- [x] Write a **getter and setter** for each field
- [x] Add validation in `setBalance()` — reject negative values (print an error message)
- [x] Add validation in `setAccountType()` — only accept `'S'` or `'C'`
- [x] Update `Main.java` to use getters/setters instead of direct field access
- [x] Answer in a comment: *why can't `Main.java` access `private` fields directly?*

because main class is outside the class of bankaccount where private variables cannot be accessed.
 
---
 
## 3. Constructors
 
- [x] Add a **default constructor** to `BankAccount` that sets `isActive = true` and `balance = 0`
- [x] Add a **parameterised constructor** that accepts `accountNumber`, `accountHolderName`, `accountType`, and `phoneNumber`
- [x] Use `this` keyword to distinguish between parameters and instance fields
- [x] In `Main.java`, create one account with each constructor — print both and verify the difference
 
---
 
## 4. Method Overloading — Deposit & Withdraw
 
- [x] Add a `deposit(double amount)` method to `BankAccount`
- [x] Overload it: `deposit(double amount, String description)` — also prints the description
- [x] Add a `withdraw(double amount)` method — check `isActive && balance >= amount` before deducting
- [x] Overload it: `withdraw(double amount, String reason)`
- [x] Call both versions of each in `Main.java` and verify output
- [ ] Answer in a comment: *why can't you overload by return type alone?*
 
---
 
## 5. Static Members — Bank Info
 
- [x] Add a `static String bankName` field to `BankAccount` — assign your bank's name
- [x] Add a `static int totalAccounts` counter — increment inside every constructor
- [x] Add a `static block` that prints `"Bank system initialised"` when the class first loads
- [x] Add a `static method getBankInfo()` that prints `bankName` and `totalAccounts`
- [x] Call `BankAccount.getBankInfo()` from `Main.java` — confirm the count is correct
- [x] Answer in a comment: *why can't a static method access instance fields like `balance`?*
 
because, static methods are shared by objects and which balance should the static method show when they are multiple objects
---
 
## 6. Arrays — Multi-Account Management
 
- [x] In `Main.java`, declare: `BankAccount[] accounts = new BankAccount[3]`
- [x] Initialise each slot with a different account using the parameterised constructor
- [x] Use a `for` loop to print each account's number, holder name, and balance
- [x] Repeat using an **enhanced for loop** — note the syntax difference in a comment
- [x] Find and print the account with the highest balance (track it with a variable)
 
---
 
## 7. String Practice
 
- [ ] Add a `getAccountSummary()` method that builds and returns a summary string using `+` concatenation
- [ ] Rewrite it using `StringBuilder` — add a comment comparing the two approaches
- [x] In `Main.java`, compare two holder names using `.equals()` — do not use `==`
- [x] Add a comment explaining why `==` gives wrong results for `String` objects

because new String forces to create a new object in heap, instead of string constant pool.
 
---
 
## 8. Anonymous Objects
 
- [x] Create an anonymous `BankAccount` and call `deposit()` on it in a single line
- [ ] Add a comment: *when would you use an anonymous object vs a named reference?*
 
---
 
## Bonus Challenges
 
- [x] Does `totalAccounts` increment for an anonymous object? Create one and call `getBankInfo()` to find out
- [x] Change `bankName` from one account reference and print it from another — what do you observe?

I observed that is changes the bankname in all the objects.
- [ ] Add a `printStatement()` method that uses a `for` loop over a dummy `double[]` array of recent transaction amounts
 
---
 
## Done? Commit with message:
```
Day 2: OOP - classes, encapsulation, constructors, static members, arrays
```
 