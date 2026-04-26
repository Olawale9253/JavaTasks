import java.util.Scanner;

public class whileLoop{
    
    public static void main(String args[]){

        Scanner userInput = new Scanner(System.in);

    int sum = 0;

    while(true){
    
        System.out.print("enter a number: ");

        sum = sum + userInput.nextInt();

        if(sum > 100)
    break;
}
System.out.println("sum is: " + sum);
}
}
