import java.util.Scanner;

    public class SumOfDigits{
    
    public static void main(String args[]){

    Scanner UserInput = new Scanner(System.in);

    System.out.print("Enter a three-digit number: ");

    int Digit = UserInput.nextInt();

    int TotalSum = Digit + Digit;

    System.out.println("Total sum is: " + TotalSum);
}

}
