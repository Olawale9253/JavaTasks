import java.util.Scanner;

public class PowerOfNumber{
    public static void main(String args[]){
        Scanner userInput = new Scanner(System.in);
        
    System.out.print("Enter a digit");

    int Number = userInput.nextInt();

    for(Number = 0; Number >= 2; Number++){

    System.out.println(Number * Number);
}
}

}
