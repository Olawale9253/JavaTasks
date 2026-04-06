import java.util.Scanner;

    public class InvestmentAmount{

    public static void main(String args []){

    Scanner UserInput = new Scanner(System.in);

    System.out.print("Enter investment amount: ");

    int AmountInvested = UserInput.nextInt();

    System.out.print("Enter annual interest rate: ");

    int InterestRate = UserInput.nextInt();
    
    System.out.print("Enter number of years: ");

    int NumberOfYears = UserInput.nextInt();

    int FutureInvestmentValue = AmountInvested * (1 + InterestRate) * (NumberOfYears * 12);

    System.out.println("Future investment value is: " + FutureInvestmentValue);
}
}
