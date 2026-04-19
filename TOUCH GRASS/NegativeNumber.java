import java.util.Scanner;
public class NegativeNumber{

    public static void main(String args[]){

       Scanner userInput = new Scanner(System.in);

        int total = 0;

        int count = 0;
        
       System.out.print("Enter a number or -1 to stop: ");    

     int Score = userInput.nextInt();

    while(Score != -1){
        
    System.out.println(count);

    total += Score;
    
     Score = userInput.nextInt();
    
    int AverageScore = total / count;

    System.out.println("Average Score is: " + AverageScore);
}
}
}
