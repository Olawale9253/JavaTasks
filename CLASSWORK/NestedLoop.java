
public class NestedLoop{

    public static void main(String args[]){

//        Scanner userInput = new Scanner(System.in);    

        int userInput = 5;  
        

    for(int mainLoop = 1; mainLoop <= userInput; mainLoop++){

    for(int space = userInput; space > mainLoop; space--){

         System.out.print(" ");

    for(int innerLoop = 1; innerLoop <= mainLoop; innerLoop++){

        System.out.print(" *");
}
        
      System.out.println(); 
    
 }  
 
}
    
}
}
