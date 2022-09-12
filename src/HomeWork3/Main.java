package HomeWork3;

import java.util.Scanner;

    public class Main {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount(20000.0);


        while (true) {

            try {
            bankAccount.withDraw(6000);
            } catch (LimitException e) {
                System.out.println(e.getMessage());
            }
            if (false)
                break;



        }

    }
}
