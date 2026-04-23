import java.util.Scanner;

public class Pattern{

public static void main(String args[]){

    
    Scanner userInput = new Scanner(System.in);

    System.out.print("Enter number of rows: ");

    int Number = userInput.nextInt();
    
       
    for(int i = 1; i <= Number; i++ ){

        for(int j = 1; j <= i; j++){

        System.out.print("*");
} 
       System.out.println();
 }       
}
}
