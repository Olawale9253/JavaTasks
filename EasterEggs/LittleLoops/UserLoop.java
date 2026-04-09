import java.util.Scanner;

public class UserLoop{

    public static void main(String[] args) {

    Scanner UserInput = new Scanner(System.in);

	System.out.print("Enter a number: ");

	int number = UserInput.nextInt();

	for (int index = 1; index <= number; index++) {

	System.out.println(index);

    }

    }
}
