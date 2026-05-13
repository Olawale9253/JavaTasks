import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestOshofree {

    @Test
    void testCartBelow5000_NoDiscount() {
        OshoFreePromoEngine engine = new OshoFreePromoEngine();
        double result = engine.calculateFinalPrice(4000.00, "");
        assertEquals(4000.00, result);
    }

    @Test
    void testCart5000To14999_WithStarter10_DiscountApplied() {
        OshoFreePromoEngine engine = new OshoFreePromoEngine();
        double result = engine.calculateFinalPrice(10000.00, "STARTER10");
        assertEquals(9000.00, result);
    }

    @Test
    void testCart15000To29999_WithBigboy20_DiscountApplied() {
        OshoFreePromoEngine engine = new OshoFreePromoEngine();
        double result = engine.calculateFinalPrice(18000.00, "BIGBOY20");
        assertEquals(14400.00, result);
    }

    @Test
    void testCart30000AndAbove_WithOshofree35_DiscountApplied() {
        OshoFreePromoEngine engine = new OshoFreePromoEngine();
        double result = engine.calculateFinalPrice(30000.00, "OSHOFREE35");
        assertEquals(19500.00, result);
    }
}
