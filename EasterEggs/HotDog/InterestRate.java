import java.util.Scanner;

    public class InterestRate{

    public static void main(String args []){

    Scanner UserInput = new Scanner(System.in);

    System.out.print("Enter your balance: ");

    double Balance = UserInput.nextInt();

    System.out.print("Enter annual interest rate: ");

    double AnnualRate = UserInput.nextInt();

    double InterestAmount = Balance * (AnnualRate / 1200);

    System.out.println("Total Annual Interest is = " + InterestAmount);
}
}
