/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication4;
import java.util.Scanner;

/**
 *
 * @author Vedika Jain
 */
public class JavaApplication4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner task4 =  new Scanner (System.in);

        // prompt the user for his information
        System.out.print("Please enter the initial balance:");
        String balance = task4.nextLine( );

        System.out.print("Please enter the annual interest rate(2 for 2%):");
        double interest = task4.nextDouble();

        System.out.print("Please enter the number of years "+
                "the client wants to save the money in the bank:");
        int years = task4.nextInt();

        // make a semicolon string ":" to be able to align it more easily
        String colon = ":";

        //Display the received information
        System.out.printf("\n Initial Balance %s %s", colon, balance);
        System.out.printf("\n Annual interest %s %.2f %%", colon, interest);
        System.out.printf("\n Saving years %4s %s \n", colon, years);

        //dispaly a seperation
        System.out.println("------------------------------------");

        //calculate and print the balance for after that many years
        Double annualinterest= interest/100;
        Double newBalance = 15000*(Math.pow(1+annualinterest,years));
        System.out.printf("\n The balance after 5 years is %s %.2f \n ", colon, newBalance);
    }
}


