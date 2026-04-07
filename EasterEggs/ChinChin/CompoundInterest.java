import java.util.Scanner;

    public class CompoundInterest{

    public static void main(String args[]){

    Scanner UserInput = new Scanner(System.in);

 // formula for simple interest is P x R X T / 100

 // formula for compound interest is A - P = P[(1 + R/100)^T - 1]

    System.out.print("Enter your principal: ");

    int Principal = UserInput.nextInt();

    System.out.print("Enter your rate: ");

    int Rate = UserInput.nextInt();

    System.out.print("Enter your time: ");

    int Time = UserInput.nextInt();

    double SimpleInterest = Principal * Rate * Time / 100;

    double Compound = Principal * ((1 + Rate / 100) * Time -1); 

    System.out.println("Simple Interest is = " + SimpleInterest);

    System.out.println("Compund Interest is = " + Compound);

}
}
