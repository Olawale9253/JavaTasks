import java.util.Scanner;

public class MaxOfTwoNumbers{

    public static void main(String args[]){

        

        int FirstNumber = 200;
    
        int SecondNumber = 150;

        int MaximumNumber = max(FirstNumber, SecondNumber);
    
        System.out.println("Maximum number = "  + MaximumNumber);
}
    public static int max(int number1, int number2){

        int max = 0;

        if(number1 > number2){
        
        max = number1;
}

        if(number1 < number2){

        max = number2;

}
    
    
        return max;

//    public static int max(int number1, int number2)
//
//    Scanner userInput = new Scanner(System.in);
//
//    System.out.println("Enter Integer");
//    
//    int Number = userInput.nextInt();
//
//    if(Number % 2 == 0){
//
//    System.out.println("The integer is true");
//    
//} else if(Number % 2 == 1){
//
//    System.out.println("The integer")









}
}
