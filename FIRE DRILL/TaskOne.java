import java.util.Scanner;

public class TaskOne{

    public static void main(String args[]){

    Scanner userInput = new Scanner(System.in);    

    int [] array = new int [10];

        for(int count = 0; count < array.length; count++){

        System.out.print("Enter score: " + (count + 1) + ": ");

        array[count] = userInput.nextInt();
}
    System.out.println("List Of Arrays: ");

    for(int count : array){
        
        System.out.println(count + " ");
}

}
}

 

