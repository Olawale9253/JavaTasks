import java.util.Scanner;

    public class Numerator{
    
        public static void main(String args[]){
    
        Scanner UserInput = new Scanner(System.in);

        System.out.print("Enter NumeratorOne: ");

        int NumeratorOne = UserInput.nextInt();

        System.out.print("Enter DenominatorOne: ");

        int DenominatorOne = UserInput.nextInt();

        System.out.print("Enter NumeratorTwo: ");

        int NumeratorTwo = UserInput.nextInt();

        System.out.print("Enter DenominatorTwo: ");

        int DenominatorTwo = UserInput.nextInt();

        int Sum = Numerator + Denominator;
    
        int Difference = Numerator - Denominator;

        int Product = Numerator * Denominator;

        float Quotient = Numerator / Denominator;

    System.out.println("sum of the number is: " + Sum);
    
    System.out.println("Difference of the number is: " + Difference);

    System.out.println("Product of the number is: " + Product);

    System.out.println("Division of the numeber is: " + Quotient);

}

}
