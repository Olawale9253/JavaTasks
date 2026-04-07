import java.util.Scanner;

    public class Month{

    public static void main(String args[]){

    Scanner UserInput = new Scanner(System.in);
    
    System.out.print("Input an integer: ");    

    int Integers = UserInput.nextInt();

    if (Integers == 1){
    
    System.out.println("January");
}

    else if (Integers == 2){
    
    System.out.println("February");
}

    else if (Integers == 3){

    System.out.println("March");
}

    else if (Integers == 4){
    
    System.out.println("April");
}
    else if (Integers == 5){
    
    System.out.println("May");
}

    else if (Integers == 6){
    
    System.out.println("June");
}
 
    else if (Integers == 7){

    System.out.println("July");
}

    else if (Integers == 8){
    
    System.out.println("August");
}
    else if (Integers == 9){
    
    System.out.println("September");
}

    else if (Integers == 10){
    
    System.out.println("October");
}
       else if (Integers == 11){
    
    System.out.println("November");
}

    else if (Integers == 12){
    
    System.out.println("December");
}
    else {
    
    System.out.println("Error message");
}
}

}
