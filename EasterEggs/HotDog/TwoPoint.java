import java.util.Scanner;

    public class TwoPoint{

    public static void main(String args []){

    Scanner UserInput = new Scanner(System.in);

    System.out.print("Enter first point x1: ");

    int X1 = UserInput.nextInt();

    System.out.print("Enter second point y1: ");

    int Y1 = UserInput.nextInt();

    System.out.print("Enter first point x2: ");

    int X2 = UserInput.nextInt();

    System.out.print("Enter second point y2: ");

    int Y2 = UserInput.nextInt();

    double Distance = ((X2 - X1 * 2) + (Y2 - Y1 * 2) * 2);

    System.out.println("Distance = " + Distance);
}
}
