import java.util.Scanner;

public class TaskTwo{

    public static void main(String [] args){
    
    Scanner UserInput = new Scanner(System.in);

    System.out.println("You Are Welcome To Know Your Age!!!");    

    System.out.println("Please Enter Your Age");

    int Age  = UserInput.nextInt();

    System.out.println("You are " + Age + " Years Old");

}
}
