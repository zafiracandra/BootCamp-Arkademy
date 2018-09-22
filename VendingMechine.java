/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vending.mechine;

/**
 *
 * @author Zafira Candra
 */
import java.util.Scanner;
public class VendingMechine {

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        final int PENNIES_PER_DOLLAR = 100;
        final int PENNIES_PER_QUARTER = 25;
        
        //prompt user
        System.out.print("Enter bill value (1,5,10): ");
        int billValue = in.nextInt();
        System.out.print("Enter item price (in pennies): ");
        int itemPrice = in.nextInt();
        
        //Calcuate change
        int change = PENNIES_PER_DOLLAR * billValue - itemPrice;
        int dollars = change / PENNIES_PER_DOLLAR;
        change = change % PENNIES_PER_DOLLAR;
        int quarters = change / PENNIES_PER_QUARTER;
        
        //print change
        System.out.printf("Dollars: %d", dollars);
        System.out.println();
        System.out.printf("Quarters: %d", quarters);
    }
    
}
