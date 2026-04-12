import java.util.Scanner;
public class Sum{

    public static void main(String[] args) {

    Scanner UserInput = new Scanner(System.in);

	System.out.print("Enter a number: ");

	int userInput = UserInput.nextInt();

	int sum = 0;

	int count = 1;

	while (count <= userInput) {

	sum = sum + count;

	System.out.println(sum);

	count++;
	}
    }
}
