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