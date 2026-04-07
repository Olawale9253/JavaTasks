import java.util.Scanner;

    public class Hours{

    public static void main(String args []){

    Scanner UserInput = new Scanner(System.in);

    System.out.print("Enter the current hour: ");    

    int Time = UserInput.nextInt();

    if (Time <= 0 || Time <= 23){

    System.out.println("Good Morning");
}
    else if (Time == 5 || Time <= 11 ){
    
    System.out.println("Good Afternoon");

}

    else if (Time == 18 || Time <= 21){
    
    System.out.println("Good Evening");

}

    else if (Time >= 22 || Time >= 24){

    System.out.println("Good Night");
}

    else{

    System.out.println("Wrong Input");
}
}
}
