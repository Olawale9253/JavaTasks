import java.util.Scanner;

    public class BirthYear{

    public static void main(String args []){

    Scanner UserInput = new Scanner(System.in);

    System.out.print("Enter your birth year: ");

    int BirthDate = UserInput.nextInt();

    System.out.print("Enter current year: ");
    
    int CurrentYear = UserInput.nextInt();

    int Age = CurrentYear - BirthDate;

    System.out.println("Your age is: " + Age);

    if (Age  >= 65){
    
    System.out.println("You're eligible for a senior citizen discount ");
}

    else{
        
    System.out.println("You are not eligible for a senior citizen discount");
}

}
}
