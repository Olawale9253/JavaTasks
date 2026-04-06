import java.util.Scanner;

    public class GratuityRate{

    public static void main(String args []){

    Scanner UserInput = new Scanner(System.in);

    System.out.print("Enter Gratuity rate: ");

    int Gratuity = UserInput.nextInt();

    System.out.print("Enter SubTotal rate: ");

    int SubTotal = UserInput.nextInt();

    double GratuityRate = (Gratuity * SubTotal) / 100;

    double SubTotalRate = GratuityRate + SubTotal;

    System.out.println("Gratuity rate is: " + GratuityRate);

    System.out.println("Sub Total rate is: " + SubTotalRate);  


}
}
