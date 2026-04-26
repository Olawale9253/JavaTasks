import org.junit.jupiter.api.Test;
 
import static org.junit.jupiter.api.Assertions.*; 

public class BackToSenderTest { 

@Test 

public void testThatIAdd2NumbersResultIsNumberOnePlusNumberTwo() {

BackToSender calc = new BackToSender();

int result = calc.add(50, 200, 5000); 

int expected = 15000; 

assertEquals(expected, result);
 }
 }
