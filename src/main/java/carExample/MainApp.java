package carExample;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class MainApp {

    public void welcome() {
        System.out.println("Welcome to Scale soft !!!!");
    }

    public static void main(String[] args) {
        // Generate a random double between 1.00 and 10.00 with two decimal places
        double randomAmount = Math.round(ThreadLocalRandom.current().nextDouble(1.00, 5.00) * 100.0) / 100.0;
        // Convert to string for input
        String amountText = String.valueOf(randomAmount);

        // Set the text using your web automation object
        System.out.println(amountText);

    }
}
