import java.util.Scanner;

public class KataKata{
    
    public static void main(String args[]){
    
    Scanner userInput = new Scanner(System.in);

    int count;

    int [] array = new int[10];

    for(count = 1; count < array.length; count++){

    System.out.print("Enter number: ");

    int number = userInput.nextInt();

    array[count] = number;

    System.out.println(count);

}
    for(int counter = 1; counter < array.length; counter++){

        System.out.print(array [counter] + " ");
}
}


}
