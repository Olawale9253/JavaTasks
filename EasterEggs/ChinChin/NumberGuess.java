import java.util.Scanner;

    public class NumberGuess{

    public static void main(String args []){

    Scanner UserInput = new Scanner(System.in);

    int Head = 0;

    int Tail = 1;

    System.out.print("Guess a number: ");

    int UserGuess = UserInput.nextInt();

    if (UserGuess == 0){
    
    System.out.println("Sorry! you didn't guess right ): ");
}

    else if (UserGuess == 1)

    System.out.println("Hurray! you guess it right (:");

    else {
    
    System.out.println("Make another guess ): ");
}
}
}
