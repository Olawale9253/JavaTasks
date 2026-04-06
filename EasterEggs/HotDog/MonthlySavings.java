import java.util.Scanner;

    public class MonthlySavings{

    public static void main(String args []){

    Scanner UserInput = new Scanner(System.in);

    System.out.print("Enter your savings amount: ");

    double Amount = UserInput.nextDouble();

    double MonthlyRate = Amount * 0.003125 * 6;

    System.out.println("Account value is = " + MonthlyRate);
}
}
