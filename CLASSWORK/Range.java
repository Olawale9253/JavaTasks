public class Range {

     public static void main(String[] args) {
        int[] numbers = {2, 5, 7, 9, 20};

        int result = findLargest(numbers);

        System.out.println("Largest element: " + result);
    }

    public static int findLargest(int[] arr) {
       
        int largest = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
                return largest;
        

        
    }

   
}
}
