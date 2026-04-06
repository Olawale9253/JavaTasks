import java.util.Scanner;

    public class PoundsWeight{

    public static void main(String args []){

    Scanner UserInput = new Scanner(System.in);

    System.out.print("Enter a weight in pounds: ");

    int Weight = UserInput.nextInt();

    System.out.print("Enter a height in inches: ");

    int Height = UserInput.nextInt();

 // Note: 1 pound = 0.45359237 kilograms;

    double PoundsWeight = 0.45359237 * Weight;

 // 1 inch = 0.0254 meters;

    double HeightInches = 0.0254 * Height * Height;

    double BMI = PoundsWeight / HeightInches;

    System.out.println("The BMI number is = " + BMI);
}
}
