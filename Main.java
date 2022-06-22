import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //This program takes an Integer provided by the user and prints out message:
        //- FizzBuzz when int can be devided by 3 AND 5
        //- Fizz when int can only be devided by 3 and not by 5
        //- Buzz when int can only be devided by 5 and not by 3
        //- Integer's initial value when it devides neither by 3 nor by 5

        Scanner scan = new Scanner(System.in);
        int input = scan.nextInt();
        System.out.println("Please enter an Integer: ");
        String output = Integer.toString(input);
        if (input % 3 == 0 && input % 5 == 0) {
            output = "FizzBuzz";
        } else if (input % 3 == 0) {
            output = "Fizz";
        } else if (input % 5 == 0) {
            output = "Buzz";
        }

        System.out.println(output);
    }
}
