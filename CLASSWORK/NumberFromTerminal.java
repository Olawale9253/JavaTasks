import java.util.Scanner;

public class Number{

    public static void main(String args[]){
    
    Scanner userInput = new Scanner(System.in);

    System.out.print("Enter number: ");

    int input = userInput.nextInt();

    if(input == 7){

        System.out.println("CORRECT");
}
    else if(input < 7){

        System.out.println("BELOW");
}

    else if(input > 7){

        System.out.println("ABOVE");
}

}

}
