import java.util.Scanner;

    public class MileToKilometerConverter{

    public static void main(String args []){

    Scanner UserInput = new Scanner(System.in);

    System.out.print("Enter a number you want to convert to kilometer: ");

    int Miles = UserInput.nextInt();    
    
    double MilesConvert = Miles * 1.609344;

//  System.out.println("Note: 1 Mile is 1.609344 multiply by the User Input");

    System.out.println("Miles travelled is: " + MilesConvert);
}
}
