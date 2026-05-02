import java.util.Scanner;

public class MenstrualApp{

    public static void main(String args[]){

    int userMenu = 0;
    
      Scanner userInput = new Scanner(System.in);
    
//        boolean menstrualapp  = false;


//        while(menstrualapp){
        
        System.out.println("===== MENSTRUAL CALCULATOR MINI APP ===== \n");

        System.out.println("May 2026 \n");
        
        System.out.println(" S   |    M   |    T   |    W   |    T   |    F   |    S \n ");

        System.out.println(" 1   |    2   |    3   |    4   |    5   |    6   |    7 ");

        System.out.println(" 8   |    9   |    10  |    11  |    12  |    13  |    14 ");

        System.out.println(" 15  |    16  |    17  |    18  |    19  |    20  |    21 ");
            
        System.out.println(" 22  |    23  |    24  |    25  |    26  |    27  |    28 ");

        System.out.println(" 29  |    30  |    31  | \n");

    System.out.println("Note: This tool should not be used alone to prevent pregnancy. Results are estimates as ovulation cycles can vary.");

System.out.println();
    System.out.println("How Long Is Your Average Cycle?");

        for(int days = 5; days <= 50; days+=5){

        System.out.println(days + " days ");
     
}
  
        System.out.print("Choose your Cycle day: ");

     userMenu = userInput.nextInt();

    switch(userMenu){

    case 1:

        System.out.println("10 days");

        break;

    case 2:

        System.out.println("15 days");

        break;

    case 3:

        System.out.println("20 days");

        break;

    case 4:

        System.out.println("25 days");

        break;

    case 5:

        System.out.println("30 days");

        break;

    case 6:

        System.out.println("35 days");

        break;

    case 7:

        System.out.println("40 days");

        break;

    case 8:

        System.out.println("45 days");

        break;

    case 9:

        System.out.println("50 days");

        break;
    
    default: System.out.println("Input your cycle date");

}

    

    



            
//}

}

}
