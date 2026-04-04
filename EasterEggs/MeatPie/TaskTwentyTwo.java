import java.util.Scanner;

    public class TaskTwentyTwo{

    public static void main(String args[]){

    Scanner UserInput = new Scanner(System.in);

    System.out.print("Enter A Radius Number: ");

    double Number = UserInput.nextDouble();

    // Formula for a radius is Pie r2 And Pie Number is 3.14159

    double RadiusNumber = 3.14159 * Number * Number;

    System.out.println("Area Of A Circle Is: " + RadiusNumber);

    
}
}
