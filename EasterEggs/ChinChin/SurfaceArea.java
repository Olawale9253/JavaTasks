import java.util.Scanner;

    public class SurfaceArea{

    public static void main(String args []){

    Scanner UserInput = new Scanner(System.in);

    System.out.print("Enter radius: ");    

    int Radius = UserInput.nextInt();

    System.out.print("Enter height: ");

    int Height = UserInput.nextInt();

    double Area = 2 * 3.14 * Radius * (Height + Radius);

    double Volume = 3.14 * Radius * Radius * Height;

    System.out.println("Surface Area = " + Area);

    System.out.println("Volume is = " + Volume);

    
}
}
