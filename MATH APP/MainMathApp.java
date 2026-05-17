import java.util.Scanner;

public class MainMathApp{
    
    public static void main(String args[]){

    System.out.println("\t ========== MINI MATH APP ========== \n \n \t Arithmetic Operations: +, -, *, /\n");

    System.out.print("Enter first number: ");

    System.out.println(getfirstNumber());

    System.out.print("Enter second number: ");

    System.out.println(getsecondNumber());

    
}

    public static int getfirstNumber(){

    Scanner userInput = new Scanner(System.in);

    int firstNumber = userInput.nextInt();

    return firstNumber;
}

    public static int getsecondNumber(){

    Scanner userInput = new Scanner(System.in);

    int secondNumber = userInput.nextInt();

    return secondNumber;
}

    public static int getArithmetic(){

    char addition = '+';
    
    char subtract = '-';

    char multiple = '*';

    char division = '/';
}
}
