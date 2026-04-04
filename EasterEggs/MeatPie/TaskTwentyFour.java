import java.util.Scanner;

    public class TaskTwentyFour{

    public static void main(String args[]){

    Scanner UserInput = new Scanner(System.in);

    System.out.print("Enter First Number: ");

    int FirstNumber = UserInput.nextInt();
    
    System.out.print("Enter Second Number: ");

    int SecondNumber = UserInput.nextInt();

    System.out.println("\n" + "Before Swap First Number Is: " + FirstNumber);

    System.out.println("Before Swap SecondNumber Is: " + SecondNumber + "\n");

   int Swap = FirstNumber;

    FirstNumber = SecondNumber;
    
    SecondNumber = Swap;

    System.out.println("After Swap First Number Is: " + FirstNumber);

    System.out.println("After Swap Second Number Is: " + SecondNumber);
}
}
