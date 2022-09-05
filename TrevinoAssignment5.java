package CSD420;
/*
Samuel Trevino
September 2nd 2022
MOD 5 Programming Assignment


 */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class TrevinoAssignment5 {

    public static void main (String[] args) {

        // Displays current file path
        File testFile = new File("");
        String currentPath = testFile.getAbsolutePath();
        System.out.println("The current path is: " + currentPath);

        // creates string variable of file path
        String file = "collection_of_words.txt";

        // Creates Set object of words in collection_of_words.txt
        Set<String> collection = new HashSet<>();

        // Try/ Catch loop that throws an exception if file is not found
        try {
            // Scanner that reads file and adds words in file to the collection Set
            Scanner reader = new Scanner(new File(file));
            while (reader.hasNextLine()) {
                String words = reader.nextLine();
                collection.add(words);
            }
            reader.close();
        } catch (FileNotFoundException e) {
            System.out.println("Error");
            e.printStackTrace();
        }

        // An array list is created from the Set collection
        ArrayList<String> myArray = new ArrayList<>(collection);

        // Prints the collection of words in an ascending sorted order
        System.out.println("\nThe list of sorted words in ascending order are: \n");
        Collections.sort(myArray);
        System.out.println(myArray);

        // Prints the collection of words in a descending sorted order
        System.out.println("\nThe list of sorted words in descending order are: \n");
        Collections.sort(myArray, Collections.reverseOrder());
        System.out.println(myArray);
    }
}

