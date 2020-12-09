import Operation.Account;
import Operation.Bank;
import Operation.CreditUnite;
import Operation.MicroCreditOrg;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Credit offering organizations are: ");
       // (String name, double interestAnnualRate, String currency, int durationDays, int minDepositSum, double depositAnnualRate, String account)

        Account account1 = new Account("1111 1111 1111", "KGS", "Eliza Churokova", 10000);
        Account account2 = new Account ("2222 2222 2222", "USD", "Eliza Churokova", 5000);
        Account account3 = new Account ("3333 3333 3333", "KGS", "Eliza Churokova", 40000);

        Account[] accounts = new Account[3];
        accounts[0] = account1;
        accounts[1] = account2;
        accounts[2] = account3;

        Bank bank = new Bank("KICB", 35, "KGS", 365, 5000, 10, accounts);

        System.out.println(bank);

        CreditUnite creditUnite = new CreditUnite ("Capital", 38, "KGS", 365, 1000000);
        System.out.println(creditUnite);

        boolean purpose = false;

        MicroCreditOrg microCreditOrg = new MicroCreditOrg("Companion", 40, "KGS", 365, true);
        System.out.println(microCreditOrg);

        //interest rate calculation:

        Scanner scanner = new Scanner(System.in);
        //System.out.println("Enter the sum for calculation: ");
        //int sum = in.nextInt(); !!!выдает nullPointerException
        //System.out.println("Your sum is: " + sum);

        int sum = 10000;
        System.out.println();
        System.out.println("Necessary amount to get credit is: " + sum + " " + bank.getCurrency());
        double interestBank = 0.35 * sum;
        double tax = 0.05 * sum;

        double interestCrUn = 0.38 * sum;
        double interestMC = 0.4 * sum;


        System.out.println("Sum of interest at bank - " + bank.getName() + ": " + interestBank + " " + bank.getCurrency()
                + ", plus you need to pay tax of amount " + tax + " " + bank.getCurrency() + ", TOTAL: "
        + (interestBank + tax) + " " + bank.getCurrency());

        System.out.println("Sum of interest at Credit Union - " + creditUnite.getName() + ": " + interestCrUn + " " + creditUnite.getCurrency());
        System.out.println("Sum of interest at Micro Credit Organization - " + microCreditOrg.getName() + ": " + interestMC + " " + microCreditOrg.getCurrency());

        // Deposit opening

        int depSum = 5000;
        if (depSum < bank.getMinDepositSum()) {
            System.out.println("The Sum for Deposit shouldn't be less than 5000 KGS");
        }

        double interestDep = 0.1 * depSum;
        System.out.println();
        System.out.println("Entered Sum to open Deposit: " + depSum + " " + bank.getCurrency() + " for 1 year");
        System.out.println("Sum of Deposit interest for 1 year: " + interestDep + " " + bank.getCurrency());

        System.out.println();
        System.out.println("Account information: ");
        for (int i = 0; i < bank.getAccounts().length; i++){
            System.out.println("Owner: " + bank.getAccounts()[i].getOwner() + ", number: "
                    + bank.getAccounts()[i].getAccountNumber() + ", type: " + bank.getAccounts()[i].getType() + ", amount: "
                    + bank.getAccounts()[i].getAmount());
        }

        System.out.println();
        int transferSum = 5000;
        int transFromAcc3 = bank.getAccounts()[2].getAmount() - transferSum;
        if (bank.getAccounts()[2].getAmount() < transferSum){
            System.out.println("Impossible to transfer, not enough money.");
        }
        int transferToAcc1 = bank.getAccounts()[0].getAmount() + transferSum;
        double rateUSD = 85.5;
        double transferToAcc2 = bank.getAccounts()[2].getAmount() + (transferSum / rateUSD);
        System.out.println("Transaction is successfully operated from Account 3 to Account 2. The account status: " + transferToAcc2);
        





    }
}
