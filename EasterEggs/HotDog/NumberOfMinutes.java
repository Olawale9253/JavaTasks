import java.util.Scanner;
   
    public class NumberOfMinutes{
    
    public static void main(String args []){

    Scanner UserInput = new Scanner(System.in);

    System.out.println("Enter the number of minutes: ");

    int Minutes = UserInput.nextInt();

    double Years = (365 / Minutes);

    System.out.println("Remaining days are: " + Years);

    
}
}
