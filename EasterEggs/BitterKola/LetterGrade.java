import java.util.Scanner;

    public class LetterGrade{

    public static void main(String args []){
    
    Scanner UserInput = new Scanner(System.in);

        System.out.print("Enter your grade: ");

    String Grade = UserInput.nextLine();

    if (Grade.equals("A")){
    
        System.out.println("Your GPA is 4.0");
}

    else if (Grade.equals("B") ){

        System.out.println("Your GPA is 3.0");
}
    else if (Grade.equals("C") ){

        System.out.println("Your GPA is 2.0");
}
    else if (Grade.equals("D") ){

        System.out.println("Your GPA is 1.0");
}
    else if (Grade.equals ("F") ){
    
        System.out.println("Your GPA is 0.0");
        
}
    else{
    
        System.out.println("Error input");
}
}
}
