import java.util.Arrays;

public class Even{
    public static int[] number(int[] list){
        int count = 0;
        for(int index = 0; index < list.length; index++) {
            if(list[index] % 2 == 0)
                count++;
        }
        
        int counter = 0;
        int[] even = new int[count];
        for(int index = 0; index < list.length; index++) {
            if(list[index] % 2 == 0) {
                even[counter] = list[index];
                counter++;
            }
        }
        
        return even;

    }

    public static void main(String[] args) {
        
        int[] ghost = {2, 7, 6, 9, 10,3};
        
        System.out.println(Arrays.toString(number(ghost)));
    }
}
