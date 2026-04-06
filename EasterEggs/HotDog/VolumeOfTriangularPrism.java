import java.util.Scanner;

    public class VolumeOfTriangularPrism{

    public static void main(String args []){
    
    Scanner UserInput = new Scanner(System.in);

    System.out.print("Enter a length of a side: ");

    int Length = UserInput.nextInt();

    double Area = 0.433;

    double Volume =  (Length * Area);

//  System.out.println("Formula for volume is: area = (root 3 / 4) x length"); 

    System.out.println("Volume is: " + Volume);

}
}
