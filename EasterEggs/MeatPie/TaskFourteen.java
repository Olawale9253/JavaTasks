import java.util.Scanner;

    public class TaskFourteen{

    public static void main(String args []){

    Scanner UserInput = new Scanner(System.in);

    System.out.println("Enter First Number");

    int FirstNumber = UserInput.nextInt();

    System.out.println("Enter Second Number");

    int SecondNumber = UserInput.nextInt();

    System.out.println("Enter Third Number");

    int ThirdNumber = UserInput.nextInt();

    int AverageNumber = (FirstNumber + SecondNumber + ThirdNumber) / 3;

    System.out.println("The Average Of The Three Number Is: " + AverageNumber);
}
}
