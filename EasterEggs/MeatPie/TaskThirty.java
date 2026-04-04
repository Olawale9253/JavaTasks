import java.util.Scanner;

    public class TaskThirty{

    public static void main(String args []){

    Scanner UserInput = new Scanner(System.in);

    System.out.print("Enter First Number: ");

    int FirstNumber = UserInput.nextInt();

    System.out.print("Enter Second Number: ");

    int SecondNumber = UserInput.nextInt();

    int Result = (FirstNumber + SecondNumber)*(FirstNumber + SecondNumber);

    System.out.println(Result);
}
}
