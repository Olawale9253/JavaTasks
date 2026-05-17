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

        int result = calculate.add(20, 10); 

        int expected = 30; 

        assertEquals(expected, result);
        
}

}
