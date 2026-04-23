import java.util.Scanner;

public class ReversePattern{

public static void main(String args[]){

    
    Scanner userInput = new Scanner(System.in);

    System.out.print("Enter number of rows: ");

    int Number = userInput.nextInt();
    
       
    for(int i = 1; i <= Number; i++ ){

        for(int j = 1; j <= Number-i; j++){

        System.out.print(" ");
} 
    for(int num3 = 1; num3 <= i; num3++){
    
        System.out.print("*");
}
       System.out.println();
 }       
}
}
