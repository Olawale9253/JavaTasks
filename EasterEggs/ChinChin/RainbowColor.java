import java.util.Scanner;

    public class RainbowColor{

    public static void main(String args []){

    Scanner UserInput = new Scanner(System.in);
    
    System.out.println("Enter a number from 1 - 7  ");

    System.out.print("Number entered is = ");

    
    int Number = UserInput.nextInt();

    if (Number == 1){
    
    System.out.println("Violet");
}
    else if(Number == 2){

    System.out.println("Indigo");
}
    else if(Number == 3){

    System.out.println("Blue");
}
    else if(Number == 4){

    System.out.println("Green");
}
    else if(Number == 5){

    System.out.println("Yellow");
}
    else if(Number == 6){

    System.out.println("Orange");
}
    else if(Number == 7){

    System.out.println("Red");
}
    else {

    System.out.println("Wrong Input");
}
}

}
