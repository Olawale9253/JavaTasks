import java.util.Scanner;

public class Product {

public static void main(String[] args) {
    
    Scanner userInput = new Scanner(System.in);


System.out.println("\n ======================================== \n");
    System.out.println("\t WELCOME TO SEMICOLON VILLAGE STORE!");
System.out.println("\n ======================================== ");


    System.out.println("This is what we sell in our store:");
    System.out.println("1. Laptop - ₦20000");
    System.out.println("2. Smartphone - ₦5000");
    System.out.println("3. Headphones - ₦3000");
    System.out.println("4. Keyboard - ₦6000");
    System.out.println("5. Mouse - ₦5000");


    System.out.println("\n === First Item ===");

    System.out.print("Enter product Number from (1 - 5): ");

    int firstProductNumber = userInput.nextInt();

    System.out.print("Enter Quantity: "); 
    int firstproductQuantity = userInput.nextInt();

 // I create a Variables to store what the user buys

    String firstProductName = "";
    double firstProductPrice = 0;

  // cheking the product they choose 

    if (firstProductNumber == 1) {

        firstProductName = "Laptop";  
    
        firstProductPrice = 20000;        

}

   if (firstProductNumber == 2) {

        firstProductName = "Smartphone";  

        firstProductPrice = 5000;          
}

    if (firstProductNumber == 3) {

        firstProductName = "Headphones";  

        firstProductPrice = 3000;          

}

    if (firstProductNumber == 4) {

        firstProductName = "Keyboard"; 
   
        firstProductPrice = 6000;           


}

    if (firstProductNumber == 5) {

        firstProductName = "Mouse";   
   
        firstProductPrice = 5000;           

}


    double firsttotalProductAmount = firstProductPrice * firstproductQuantity;


    System.out.println("\n === Second Item ===");
    System.out.print("Enter product Number from (1 - 5): ");
    int secondProductNumber = userInput.nextInt();

    System.out.print("Enter Quantity: ");  
    int secondproductQuantity = userInput.nextInt();

 // I create a Variables to store what the user buys

    String secondProductName = "";
    double secondProductPrice = 0;

  // cheking the product they choose 

    if (secondProductNumber == 1) {
        secondProductName = "Laptop";       
        secondProductPrice = 20000;      

}

   if (secondProductNumber == 2) {
        secondProductName = "Smartphone";   
        secondProductPrice = 5000;          
}

    if (secondProductNumber == 3) {
        secondProductName = "Headphones";   
        secondProductPrice = 3000;           

}

    if (secondProductNumber == 4) {
        secondProductName = "Keyboard";     
        secondProductPrice = 6000;           


}

    if (secondProductNumber == 5) {
        secondProductName = "Mouse";        
        secondProductPrice = 5000;            

}

//    Now I have to calculate the second Item 

    double secondtotalProductAmount = secondProductPrice * secondproductQuantity;


// ==============================================
        // Calculate SUBTOTAL (adding everything)
//==============================================


double subtotal = firsttotalProductAmount  + secondtotalProductAmount;

// ==============================================
        // STEP 6: Calculate the discount
// ==============================================


double discount = 0;

if(subtotal >= 500) {

    discount = subtotal * 0.15;

} else if (subtotal >= 300) {

    discount = subtotal * 0.10;

} else if (subtotal >= 100) {   

    discount = subtotal * 0.05;

} else {
    discount = 0;
}

// ==============================================
        //  Calculate VAT (7.5% tax)
// ==============================================

double afterDiscount = subtotal - discount;
double vat = afterDiscount * 0.075;

double billTotal = afterDiscount + vat;


    System.out.println("\n\n========================================");
        System.out.println("        ITEM   QTY   PRICE     TOTAL ");
        System.out.println("          \t YOUR RECEIPT" );
        System.out.println("========================================");

  // Print each item (only if quantity is more than 0 we cant have less than zero)

if(firstproductQuantity > 0) {

    System.out.println(firstProductName + " x " + firstproductQuantity + " = ₦" + firsttotalProductAmount);

}

if(secondproductQuantity > 0) {

    System.out.println(secondProductName + " x " + secondproductQuantity + " = ₦" + secondtotalProductAmount);

}

System.out.println("----------------------------------------");
        System.out.println("Subtotal:         ₦" + subtotal);
        System.out.println("Discount:        -₦" + discount);
        System.out.println("After discount:   ₦" + afterDiscount);
        System.out.println("VAT (7.5%):      +₦" + vat);
        System.out.println("========================================");
        System.out.println("BILL TOTAL:      ₦" + billTotal);  
        System.out.println("========================================");
        System.out.println("\t THANK YOU FOR YOUR PATRONAGE!");
        System.out.println("Have a great day! 🥳️");
        System.out.println("========================================");


}
}
