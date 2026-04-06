import java.util.Scanner;

    public class LengthOfEquilaterialAngle{

    public static void main(String args []){

    Scanner UserInput = new Scanner(System.in);

    System.out.print("Enter the length of a side: "); 

    int Length = UserInput.nextInt();   

  //System.out.println("To find area of an triangle: Area is (root 3 / 4) * (square root of length input by User))")

    double Area = (1.732 / 4 * (Length * Length));
        
    System.out.println("Area of a triangle is: " + Area);

}
} 
