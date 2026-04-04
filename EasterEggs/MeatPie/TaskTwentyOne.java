import java.util.Scanner;

    public class TaskTwentyOne{

    public static void main(String args []){

    Scanner UserInput = new Scanner(System.in);

    System.out.print("Enter A Base Number:");

    int Base = UserInput.nextInt();

    System.out.print("Enter A Height Number:");

    int Height = UserInput.nextInt();

    double AreaOfTriangle = 0.5 * Height * Base;

    System.out.println("Area Of A Triangle 1/2 (b*h)");

    System.out.println("Area Of A Triangle Is:" + AreaOfTriangle);
}
}
