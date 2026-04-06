import java.util.Scanner;

    public class IntegerRead{

    public static void main(String args []){

    Scanner UserInput = new Scanner(System.in);

    System.out.print("Enter a number between 0 and 1000: ");

    int NumberInput = UserInput.nextInt();

    double Number = NumberInput % 1000;
    
    System.out.println("Sum of integer is: " + NumberInput);
}

}
