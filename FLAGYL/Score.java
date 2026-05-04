import java.util.Scanner;

public class SuperSimpleGrade {
    
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        
        System.out.print("How many students? ");
        int total = userInput.nextInt();
        
        int a = 0, b = 0, c = 0, d = 0, f = 0;
        
        for (int count = 1; count <= total; count++) {
            System.out.print("Score for student " + count + ": ");
            int score = userInput .nextInt();
            
            if (score >= -5) {
                System.out.println("Grade: A");
                a++;
            } else if (score >= -10) {
                System.out.println("Grade: B");
                b++;
            } else if (score >= -15) {
                System.out.println("Grade: C");
                c++;
            } else if (score >= -20) {
                System.out.println("Grade: D");
                d++;
            } else {
                System.out.println("Grade: F");
                f++;
            }
        }
        
        System.out.println("\n--- RESULTS ---");
        System.out.println("A: " + a);
        System.out.println("B: " + b);
        System.out.println("C: " + c);
        System.out.println("D: " + d);
        System.out.println("F: " + f);
        
    }
}
