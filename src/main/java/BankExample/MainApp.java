package BankExample;

import java.util.Scanner;

public class MainApp {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age = input.nextInt();

        if (age >= 60) {
            SeniorCitizen seniorCitizen = new SeniorCitizen();
            System.out.println("Please enter your first name: ");
            seniorCitizen.firstName = input.next();
            System.out.println("Please enter your last name: ");
            seniorCitizen.lastName = input.next();
            System.out.println("first name: " + seniorCitizen.firstName);
            System.out.println("last name: " + seniorCitizen.lastName);
            System.out.println("AccountType " + " : " + seniorCitizen.accountType);
        } else if (age >= 18 && age <= 59) {
            CustomerInfo customerInfo = new CustomerInfo();
            System.out.println("Please enter your first name: ");
            customerInfo.firstName = input.next();
            System.out.println("Please enter your last name: ");
            customerInfo.lastName = input.next();
            System.out.println("first name: " + customerInfo.firstName);
            System.out.println("last name: " + customerInfo.lastName);
            System.out.println("AccountType " + " : " + customerInfo.accountType);
        } else {
            System.out.println("Your not eligible please get out !!!!");
        }

    }
}
