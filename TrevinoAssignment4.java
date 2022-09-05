package CSD420;

/*
Samuel Trevino
August 23rd, 2022
MOD 4 Programming Assignment

-Write a test program that stores 50,000 integers in LinkedList and test the time to traverse the list using an iterator vs. using the get(index) method.
-Then, test your program storing 500,000 integers.
-After completing this program and having tested both values, in your comments, explain the results and discuss the time taken using both values and their difference with the get(index) approach.
-Write test code that ensures the code functions correctly.

 */

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Random;

public class TrevinoAssignment4 {

    public static void main (String[]args) {

        // Random function
        Random rand = new Random();
        // Iterator function
        Iterator<Integer> iterator;

        // Creates a LinkedList for Integers
        LinkedList<Integer> linkList = new LinkedList<>();

        long startTime;
        long endTime;

        // 50,000 Integer Linked List
        System.out.println("50,000 Integer List:\n");

        // For loop to add integers to LinkedList
        for (int i = 0; i < 50000; i++) {
            linkList.add(rand.nextInt(100));
        }

        // Prints the size of the linked list
        System.out.println("List contains " + linkList.size() + " integers");

        // Start timer for using the get method
        startTime = System.currentTimeMillis();

        // Get method to iterate through the list
        for (int i = 0; i < linkList.size(); i++) {
            int listVals = linkList.get(i);
        }

        // Calculates time it takes to add 50,000 integers
        endTime = System.currentTimeMillis();
        System.out.println("Total time in milliseconds using the get(index) method: " + (endTime - startTime));

        // Start timer for using the iterator method
        startTime = System.currentTimeMillis();

        // Iterator to traverse LinkedList using a while loop
        iterator = linkList.iterator();
        while (iterator.hasNext()) {
           iterator.next();
        }

        // Calculates time it takes to iterate through 50,000 integers using the iterator method
        endTime = System.currentTimeMillis();
        System.out.println("Total time in milliseconds using the iterator method: " + (endTime - startTime));


        ///////////////// 500,000 Integer List//////////////////////////////////
        LinkedList<Integer> linkList2 = new LinkedList<>();

        // 500,000 Integer Linked List
        System.out.println("\n500,000 Integer List:\n");

        // For loop to add integers to Linked List
        for (int i = 0; i < 500000; i++) {
            linkList2.add(rand.nextInt(100));
        }

        // Prints the size of the linked list
        System.out.println("List contains " + linkList2.size() + " integers");

        // Start timer for using the get method
        startTime = System.currentTimeMillis();

        // Get method to iterate through the list
        for (int i = 0; i < linkList2.size(); i++) {
            int listVals2 = linkList2.get(i);
        }

        // Calculates time it takes to add 500,000 random integers
        endTime = System.currentTimeMillis();
        System.out.println("Total time in milliseconds using the get(index) method: " + (endTime - startTime));

        // Start timer for using the iterator method
        startTime = System.currentTimeMillis();

        // Iterator to traverse LinkedList using a while loop
        iterator = linkList2.iterator();
        while (iterator.hasNext()) {
            iterator.next();
        }

        // Calculates time it takes to iterate through 50,000 & 500,000 random integers
        endTime = System.currentTimeMillis();
        System.out.println("Total time in milliseconds using the iterator method: " + (endTime - startTime));


        /*
         The iterator method returns the list faster than the get() method for 50,000 and 500,000 random integers.
         The fewer the items in the list, the less the difference in time between the two different methods. When creating
         a 500,000 integer linked list and retrieving the elements using the get method, it takes approx 10 times the
         amount of time to traverse the list compared to the 50,000 element list.
         From my understanding, a linked list accesses stored values a lot quicker than say an ArrayList due to the lack of the
         random access in a linked list. When retrieving the elements from a linked list, the iterator is faster because
         it does not begin from the beginning of the list every time it wants to retrieve an element and instead hopes
         each node as it traverses the list.
         */

    }
}
