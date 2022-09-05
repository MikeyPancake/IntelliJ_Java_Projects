package CSD420;

/*
Samuel Trevino
August 21st, 2022
MOD 3 Assignment


    Write a test program that contains a static method that returns a new ArrayList.
        -The new ArrayList returned will contain all original values with no duplicates from the original ArrayList.
        -Fill the Original ArrrayList with 50 random values from 1 to 20.
        -public static <E> ArrayList<E> removeDuplicates(ArrayList<E> list)

    Write test code that ensures the code functions correctly.

 */

import java.util.ArrayList;
import java.util.Random;

public class TrevinoAssignment3 {

    public static void main (String[] args){

        // Calls random function
        Random rand = new Random();
        // Creates new Integer Array List
        ArrayList<Integer> myList = new ArrayList<>();

        System.out.println("Original List: ");

        // For loop that creates 50 random values and bounds them to 1 - 20.
        for (int i = 0; i < 50; i++){
            myList.add(rand.nextInt(20)+1);
            // Gets Array values and prints them
            System.out.print(myList.get(i) + " ");
        }

        // Instantiates Array list from the remove duplicate method and pass original list to method
        ArrayList <Integer> newList = removeDuplicates(myList);

        System.out.println("\nNew List: ");

        // For loop that iterates through the new List and prints non-duplicated values
        for (int i = 0; i < newList.size(); i++){
            System.out.print(newList.get(i) + " ");
        }
    }

    // Static method that returns an Array list with duplicated values removed
    public static <E> ArrayList <E> removeDuplicates(ArrayList <E> list){

        ArrayList <E> newList = new ArrayList <E> ();

        // for loop that takes values from original list and add them to new list without adding duplicates
        for (int i = 0; i < list.size(); i++){
            if (! newList.contains(list.get(i))){
                newList.add(list.get(i));
            }
        }
        // Returns new list to main method
        return newList;
    }
}
