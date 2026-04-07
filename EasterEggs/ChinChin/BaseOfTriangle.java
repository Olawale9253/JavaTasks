import java.util.Scanner;

    public class BaseOfTriangle{

    public static void main(String args[]){

    Scanner UserInput = new Scanner(System.in);

    System.out.print("Enter a base number: ");

    int Base = UserInput.nextInt();

    System.out.print("Enter a height number: ");

    int Height = UserInput.nextInt();

    double Area = (Base * Height) / 2;

    System.out.println("Area is = " + Area);
}
}
