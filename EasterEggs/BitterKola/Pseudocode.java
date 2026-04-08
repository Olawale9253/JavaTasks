import java.util.Scanner;

    public class Pseudocode{

    public static void main(String args []){

    Scanner UserInput = new Scanner(System.in);
    
    System.out.print("Enter first number: ");    
    
    int Largest = UserInput.nextInt();

    System.out.print("Enter second number: ");

    int SecondNumber = UserInput.nextInt();

    if(SecondNumber > Largest){
        
       Largest = SecondNumber;
}
      System.out.print("Enter third number: ");

        int ThirdNumber = UserInput.nextInt();
        
    if(ThirdNumber > Largest){

        Largest = ThirdNumber;
}

    System.out.print("Enter fourth number: ");

    int FourthNumber = UserInput.nextInt();

    if(FourthNumber > Largest){
    
        Largest = FourthNumber;
}

    System.out.print("Enter Fifth number: ");

    int FifthNumber = UserInput.nextInt();

    if (FifthNumber > Largest){
        
        Largest = FifthNumber;

}

        System.out.println("Largest number is: " + Largest);
}

}
