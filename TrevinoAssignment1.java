package CSD420;

/*

Samuel Trevino
August 11, 2022
MOD 1 Assignment

Write a program that stores:

- An array of five random integers
- A Data objective instance using the current date
- An array of five random double values

Append the data in a file titled <your name> datafile.dat.
Write a second program that will read the file and display the data.
 */


import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class TrevinoAssignment1 {

    public static void main (String[]args) throws IOException {

        // True to append False to add new
        try (PrintWriter output = new PrintWriter(new FileOutputStream("TrevinoDataFile.dat", true))) {

            // Creates instance of date
            Date date = new Date();
            // Creates date format
            SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
            String dateStr = formatter.format(date);
            // Adds date to file
            output.println("\nToday's date is:\n" + dateStr + "\n");

            // Array of 5 random Integers
            output.print("5 Random Integers: ");
            // Creates instance of Random
            Random randInt = new Random();
            // Creates Int Array
            int[] intArray = new int[5];
            // For loop that creates ints till it reaches 5
            for (int i = 0; i < intArray.length; i++) {
                intArray[i] = randInt.nextInt();
                // Adds int array to file
                output.println(intArray[i]);
            }

            // Array of 5 random doubles
            output.println("\n5 Random Doubles Integers: ");
            // Creates instance of random
            Random randDouble = new Random();
            // Creates an array of doubles
            double[] doubleArray = new double[5];
            // For loop that creates doubles till it reached 5
            for (int i = 0; i < doubleArray.length; i++) {
                doubleArray[i] = randDouble.nextDouble();
                // Adds double array to file
                output.println(doubleArray[i]);
            }
        }catch(IOException e){
            System.out.println(e);
        }
    }
}
