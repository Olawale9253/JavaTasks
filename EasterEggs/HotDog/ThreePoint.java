import java.util.Scanner;

    public class ThreePoint{

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

    System.out.print("Enter first point x3: ");

    int X3 = UserInput.nextInt();

    System.out.print("Enter second point y3: ");

    int Y3 = UserInput.nextInt();

    double Side = ((X1 - Y1) + (X2 - Y2) + (X3 - Y3)) / 2;

    double Area = Side * (Side - (X1 - Y1) + (Side - X2 - Y2) + (Side - X3 - X3) * 2);

    System.out.println("Area is = " + Area);

}
}
