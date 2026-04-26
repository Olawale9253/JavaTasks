import org.junit.jupiter.api.Test;
 
import static org.junit.jupiter.api.Assertions.*; 

public class CalculatorTest { 

@Test 

public void testThatIAdd2NumbersResultIsNumberOnePlusNumberTwo() {

Calculator calc = new Calculator();

int result = calc.add(3, 4); 

int expected = 7; 

assertEquals(expected, result);
 }
 }
