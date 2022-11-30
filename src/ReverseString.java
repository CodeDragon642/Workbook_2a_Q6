import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        //initialise the scanner to read user inputs
        Scanner reader = new Scanner(System.in);

        //ask the user to input the string we will print in reverse
        System.out.println("Please input a string: ");

        //initialise the array
        char[] letters = reader.nextLine().toCharArray();

        System.out.println("The string printed in reverse is: ");

        //use for loop to read from index length-1 to index 0
        for (int i = (letters.length - 1); i >= 0; i--) {
            System.out.print(letters[i]);
        }

    }
}