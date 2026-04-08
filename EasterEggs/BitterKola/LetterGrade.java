import java.util.Scanner;

    public class LetterGrade{

    public static void main(String args []){
    
    Scanner UserInput = new Scanner(System.in);

<<<<<<< HEAD
    System.out.print("Enter your grade: ");
=======
        System.out.print("Enter your grade: ");
>>>>>>> dee4a4865da98aae8938f263361f3322772733e5

    String Grade = UserInput.nextLine();

    if (Grade.equals("A")){
    
<<<<<<< HEAD
    System.out.println("Your GPA is 4.0");
=======
        System.out.println("Your GPA is 4.0");
>>>>>>> dee4a4865da98aae8938f263361f3322772733e5
}

    else if (Grade.equals("B") ){

<<<<<<< HEAD
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
=======
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
>>>>>>> dee4a4865da98aae8938f263361f3322772733e5
}
}
}
