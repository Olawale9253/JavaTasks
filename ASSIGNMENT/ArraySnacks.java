public class ArraySnacks {

    public static int findLargest(int[] arr) {
       
        int largest = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
                return largest;
        }

        
    }

    public static void main(String[] args) {
        int[] numbers = {4, 9, 2, 15, 7};

        int result = findLargest(numbers);

        System.out.println("Largest element: " + result);
    }
}


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Create scanner for user input
        Scanner scanner = new Scanner(System.in);
        
        // Initialize an array for 10 scores
        int[] scores = new int[10];
        
        // Loop to collect scores
        for (int i = 0; i < scores.length; i++) {
            System.out.print("Enter score " + (i + 1) + ": ");
            scores[i] = scanner.nextInt();
        }
        
        // Print the stored scores
        System.out.println("\nScores collected successfully!");
        System.out.print("Your array: ");
        for (int score : scores) {
            System.out.print(score + " ");
        }
        
        scanner.close();
    }
}


