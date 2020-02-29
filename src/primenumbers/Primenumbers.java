
/*
* Amer Stas
* 27/0/2020
* This program wil find all the prime numbers in a given boundery.
 */
package primenumbers;

import java.util.Scanner;

public class Primenumbers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(" Please enter a number ");
        // Declaring variables.
        int bound;
        bound = input.nextInt();
        int count;
        int i;
        int j;
        // Using a loop in order to reach to the boundery
        for (i = 2; i <= bound; i++) {
             count = 0;
            for (j = 2; j <= i / 2; j++) {
                // Determing if the number if prime or not    
                if (i % j ==0) {
                    count++;
                    break;
                }
            }
            // Outputting the prime numbers.
            if (count == 0 && i != 1) {
                System.out.println(i + "");
            }
        }
    }
}
