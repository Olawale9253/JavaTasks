import java.util.Date;

public class CurrentTime {

    public static void main(String[] args) {

    long millis = System.currentTimeMillis();

    Date date = new Date(millis);

    System.out.println("Date, time and year:" + date);
}

}
