import java.util.Scanner;

    public class PrintNumberDown{

    public static void main(String[] args) {

    Scanner UserInput = new Scanner(System.in);

	System.out.print("Enter a number: ");

	int number = UserInput.nextInt();

	for(int i = number; i >= 1; i--) {

	System.out.println(i);
	}

    }
}
