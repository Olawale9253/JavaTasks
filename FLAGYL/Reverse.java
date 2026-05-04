import java.util.Scanner;
public class Reverse {

public static void main(String[] args) {

Scanner userInput = new Scanner(System.in);
String output = "";
System.out.println("Enter 10 numbers: ");

 for( int count = 0; count <= 10; count ++) {

    System.out.print("Number: ");

    int counts = userInput.nextInt();   
    output = counts + " " + output;
}

S   ystem.out.println(output);
}

}
