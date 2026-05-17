import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestOshofreeTest {

    @Test

    void testCartBelow5000_NoDiscount() {

        OshoFreePromoEngine engine = new OshoFreePromoEngine();

        double result = engine.calculateFinalPrice(4000.00, "");

        assertEquals(4000.00, result);
    }

}
