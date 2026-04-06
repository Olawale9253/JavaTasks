import java.util.Scanner;

    public class InitialVelocity{
    
    public static void main(String args []){

    Scanner UserInput = new Scanner(System.in);

    System.out.print("Enter your initial velocity: ");

    int Velocity = UserInput.nextInt();

    System.out.print("Enter the time taken: ");

    int TimeTaken = UserInput.nextInt();

    System.out.print("Enter the acceleration number: ");

    int Accelerate = UserInput.nextInt();

    double DistanceCovered = ((Velocity * TimeTaken) + 0.5 * Accelerate * (TimeTaken * TimeTaken)); 

    System.out.println("Distance Covered is = " + DistanceCovered);
}

}
