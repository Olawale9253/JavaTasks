import java.util.Scanner;

    public class HeatTemperature{

    public static void main(String args []){

    Scanner UserInput = new Scanner(System.in);

    System.out.print("Enter the amount of water: ");

    int Kilograms = UserInput.nextInt();

    System.out.print("Enter the initial temperature value: ");

    int InitialTemperature = UserInput.nextInt();

    System.out.print("Enter the final temperature value: ");

    int FinalTemperature = UserInput.nextInt();

    int TotalEnergy = Kilograms * (FinalTemperature - InitialTemperature) * 4184;

    System.out.println("Total Energy is = " + TotalEnergy);
}
}
