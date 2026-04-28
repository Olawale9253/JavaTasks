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
