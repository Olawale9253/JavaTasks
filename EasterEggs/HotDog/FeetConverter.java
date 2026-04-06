import java.util.Scanner;

    public class FeetConverter{

    public static void main(String args []){

    Scanner UserInput = new Scanner(System.in);

    System.out.print("Enter a number: ");

    int Number = UserInput.nextInt();

// System.out.println("To convert feet and meter, 1 meter is 3.2786 feet x the user input");

    double Meter = 3.2786;

    double Feet = (Number * Meter);

    System.out.println("Result is " + Feet + " Feet");
}
}
