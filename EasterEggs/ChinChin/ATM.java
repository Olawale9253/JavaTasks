import java.util.Scanner;

    public class ATM{

    public static void main(String args[]){

    Scanner UserInput = new Scanner(System.in);

    System.out.println("Welcome To A Mini Atm Machine");
    
    System.out.print("Enter your pin: ");

    int Pin = UserInput.nextInt();

    if(Pin == 1234){
    
    System.out.println("Your balance is $1000");
} 

    else {
    
    System.out.println("Incorrect PIN! ");
}

}
}
