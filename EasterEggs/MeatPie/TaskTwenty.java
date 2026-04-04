import java.util.Scanner;

    public class TaskTwenty{

    public static void main(String args []){

    Scanner UserInput = new Scanner(System.in);

    System.out.print("Enter Your Length: ");

    int Length = UserInput.nextInt();

    System.out.print("Enter Your Width: ");

    int Width = UserInput.nextInt();
    
    int Area = Length * Width;

    System.out.println("Area Is : " + Area);
}
}
