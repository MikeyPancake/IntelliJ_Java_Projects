package CSD420;

/*
Samuel  Trevino
August 19th 2022
MOD 2 Assignment


Create a program using a recursive method that returns the sum of the following type inputs.
    m(i) = 1/2 + 2/3 + 3/4 + 4/5 + 5/6 … i/(i + 1)
    ‘m’ is to be replaced with the method name you use.

Use three different input finishing values, testing your code to ensure it functions correctly.
    Examples: m(4), m(9), m(14).

 */

public class TrevinoAssignment2 {

    // Main Method
    public static void main (String [] args){

        System.out.printf("The sum is: " + "%.2f%n", recursMeth(1));
        System.out.printf("The sum is: " + "%.2f%n", recursMeth(4));
        System.out.printf("The sum is: " + "%.2f%n", recursMeth(10));

    }
    // Recursive Method
    public static double recursMeth(int i) {

        // Base case
        if (i == 1) {
            return 1.0 / 2.0;
        }
        else {
            // Sets sum with numerator and denominate based in main method inputs
            double sum = i / (i + 1.0);

            // Adds int types until the recursive amount reaches base case
            return sum + recursMeth(i - 1);
        }
    }
}
