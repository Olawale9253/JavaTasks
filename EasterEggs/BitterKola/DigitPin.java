import java.util.Scanner;

    public class DigitPin {

    public static void main(String args[]){

    Scanner UserInput = new Scanner(System.in);

    System.out.println("Enter your pin: ");

    int Pin = UserInput.nextInt();

    if(Pin == 1000 || Pin >= 9999){

    System.out.println("Valid Pin");
}

    else{
    
    System.out.println("Invalid Pin");
}
}
}
