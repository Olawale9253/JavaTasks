import java.util.Scanner;

    public class LeapYear{

    public static void main(String args[]){
    
    Scanner UserInput = new Scanner(System.in);

    System.out.print("Enter month: ");

<<<<<<< HEAD
    String Month = UserInput.nextLine();
=======
    String Month = UserInput.next();
>>>>>>> dee4a4865da98aae8938f263361f3322772733e5

    System.out.print("Enter year: ");
    
    int Year = UserInput.nextInt();

    System.out.println(Year);

    if(Month == "January"){
    
    System.out.println("31 days");

}
<<<<<<< HEAD
    else if (Month == "February"){

    System.out.println("29 days");
}
    else if (Month == "March"){

    System.out.println("31 days");
}
    else if (Month == "April"){

    System.out.println("30 days");
}
    else if (Month == "May"){

    System.out.println("31 days");
}
    else if (Month == "June"){

    System.out.println("30 days");
}
    else if (Month == "July"){

    System.out.println("31 days");
}
    else if (Month == "August"){

    System.out.println("31 days");
}
    else if (Month == "September"){

    System.out.println("31 days");
}
    else if (Month == "October"){

    System.out.println("31 days");
}
    else if (Month == "November"){

    System.out.println("31 days");
}
    else if (Month == "December"){

    System.out.println("31 days");
 }   
=======
    else if (Month == "February")

    System.out.println("29 days");

    else if (Month == "March")

    System.out.println("31 days");

    else if (Month == "April")

    System.out.println("30 days");

    else if (Month == "May")

    System.out.println("31 days");

    else if (Month == "June")

    System.out.println("30 days");

    else if (Month == "July")

    System.out.println("31 days");

    else if (Month == "August")

    System.out.println("31 days");

    else if (Month == "September")

    System.out.println("31 days");

    else if (Month == "October")

    System.out.println("31 days");

    else if (Month == "November")

    System.out.println("31 days");

    else if (Month == "December")

    System.out.println("31 days");
    
>>>>>>> dee4a4865da98aae8938f263361f3322772733e5
    else{
    
    System.out.println("wrong Input");
}

}
}
