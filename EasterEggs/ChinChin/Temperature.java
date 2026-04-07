import java.util.Scanner;

    public class Temperature{

    public static void main(String args []){

    Scanner UserInput = new Scanner(System.in);

    System.out.print("Enter a temperature digit: ");    

    int Celsius = UserInput.nextInt();

    if (Celsius <= 0 ){

    System.out.println("Freezing");
}
    else if (Celsius == 0 || Celsius <= 15 ){
    
    System.out.println("Cold");

}

    else if (Celsius == 16 || Celsius <= 25){
    
    System.out.println("Warm");

}

    else if (Celsius >= 25){

    System.out.println("Hot");
}

    else{

    System.out.println("Wrong Input");
}
}
}
