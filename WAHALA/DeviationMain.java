//public class DeviationMain{
//
//    public static void main(String args[]){
//
//    System.out.println("\t Formula for the work \n\n variance = sum of mean deviation / total frequency \n mean = sum of number / number of number \n sum = add all numbers ");
//
//
//
//}
//
//    
//
//}

import java.util.Scanner;

public class StandardDeviation {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of values: ");
        int n = input.nextInt();

        double[] numbers = new double[n];

        double sum = 0;

       
        for (int i = 0; i < n; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = input.nextDouble();

            sum = sum + numbers[i];
        }

      
        double mean = sum / n;

     
        double total = 0;

        for (int i = 0; i < n; i++) {
            double difference = numbers[i] - mean;
            total = total + (difference * difference);
        }

     
        double variance = total / n;

      
        double standardDeviation = variance / 2;

        for (int i = 0; i < 10; i++) {
            standardDeviation =
                (standardDeviation + (variance / standardDeviation)) / 2;
        }

      
        System.out.println("Mean = " + mean);
        System.out.println("Standard Deviation = " + standardDeviation);

     
    }
}
