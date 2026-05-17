import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MathAppTest{

     @Test

    public void testThatAddOperatorIsWorking(){

       MathApp calculate  = new MathApp();

        int result = calculate.add(10, 20); 

        int expected = 30; 

        assertEquals(expected, result);
        
}

    @Test

    public void testThatSubtractOpertatorIsWorking(){

       MathApp calculate  = new MathApp();

        int result = calculate.subtract(20, 10); 

        int expected = 10; 

        assertEquals(expected, result);
        
}

    @Test

    public void testThatMultiplyOpertatorIsWorking(){

       MathApp calculate  = new MathApp();

        int result = calculate.multiply(20, 10); 

        int expected = 200; 

        assertEquals(expected, result);
        
}

    @Test

    public void testThatDivisionOpertatorIsWorking(){

       MathApp calculate  = new MathApp();

        double result = calculate.division(20, 10); 

        double expected = 2.0; 

        assertEquals(expected, result);
        
}
}
