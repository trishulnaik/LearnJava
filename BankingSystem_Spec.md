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