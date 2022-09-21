/*
Samuel Trevino
September 20th, 2022
MOD 8 Assignment

Create a class titled <your first name here> ThreeThreads.
In this class, you are to use three threads to output three types of characters to a text area for display.
    -In the first thread, you are to output random letter characters such as a, b, c, d …
    -In the second thread, you are to output random number digits such as 0, 1, 2, 3, 4, 5, 6, 7, 8, 9
    -In the third thread, you are to output random characters such as !, @, #, $, %, &, *
Display a minimum of 10,000 of each of the three sets.
 */

import java.lang.Thread;
import java.util.Random;


// Main Class
public class TrevinoAssignment8{

    public static void main(String[] args) {

        // Creates an instance of the classes
        randomLetter thread1 = new randomLetter();
        randomNumber thread2 = new randomNumber();
        randomCharacter thread3 = new randomCharacter();

        // Start function for the classes
        thread1.start();
        thread2.start();
        thread3.start();
        }
    }
// Random Letter Thread
class randomLetter extends Thread {

    public void run(){
        // Instance of a random letter
        Random randLet = new Random();
        // For loop that creates 10k letters that are a - z
        for (int i = 0; i < 10000; i++){
            char character = (char) (randLet.nextInt(26) + 'a');
            System.out.println("Random Letter Thread: " + character);

        }
    }
}
// Random Number Thread
class randomNumber extends Thread{

    public void run(){
        // Instance of a random number
        Random randNum = new Random();
        // For loop that creates 10k numbers that are 0 - 10
        for (int i = 0; i < 10000; i++){
            int number = randNum.nextInt(10 + 1);
            System.out.println("Random Number Thread: " + number);
        }
    }
}
// Random Character Thread
class randomCharacter extends Thread{

    public void run(){
        // Instance of a random character
        Random randChar = new Random();
        // For loop that creates 10k characters that are within the ASCII table
        for (int i = 0; i < 10000; i++){
            char character = (char) (randChar.nextInt(128));
            System.out.println("Random Character Thread: " + character);
        }
    }
}