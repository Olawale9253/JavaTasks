import java.util.Scanner;

    public class HexagonSize{
    
    public static void main(String args[]){

    Scanner UserInput = new Scanner(System.in);

    System.out.print("Enter the side of a hexagon: ");
    
    int Side = UserInput.nextInt();

    double Area = (5.1962 / 2) * Side * Side;

    System.out.println("Area = " + Area);
}

}
