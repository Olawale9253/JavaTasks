import java.util.Scanner;

    public class ConvertSquareMeterToPing{

    public static void main(String args []){

    Scanner UserInput = new Scanner(System.in);

    System.out.print("Enter a number:");

    int UserNumber = UserInput.nextInt();
    
    double SquareMeter = 0.3025;

    double Ping = (UserNumber * SquareMeter);

    System.out.println("The result is: " + Ping);
}
}
