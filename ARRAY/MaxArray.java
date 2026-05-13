public class MaxArray {

    public static void main(String[] args) {
     
     int[] numbers = {2,1,2,5,2,4};
        
     for (int count = 0; count < numbers.length; count++) {

       for (int counter = count + 1; counter < numbers.length; counter++) {

         if (numbers[count] == numbers[counter]) {
                  
            System.out.println("[" + numbers[count] + "]");
                    
                 return;

}
}
}
}
}
