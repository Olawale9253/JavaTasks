import java.util.Scanner;
 
    public class AirplaneAcceleration{
    
    public static void main(String args []){

    Scanner UserInput = new Scanner(System.in);

    System.out.print("Enter take-off speed: ");

    int Speed = UserInput.nextInt();

    System.out.print("Enter acceleration: ");

    int Accelerate = UserInput.nextInt();

    double Runway = Speed * Speed / (2 * Accelerate);

    System.out.println("Runway Length is = " + Runway);
}
}
