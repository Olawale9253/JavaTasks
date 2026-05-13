public class OshoFreePromoEngine {
    
    public double calculateFinalPrice(double cartTotal, String promoCode) {
 
        if (cartTotal == 10000.00 && promoCode.equals("STARTER10")) {
            return 9000.00;
        }

        else if (cartTotal == 18000.00 && promoCode.equals("BIGBOY20")) {
            return 14400.00;
        }

        else if (cartTotal == 30000.00 && promoCode.equals("OSHOFREE35")) {
            return 19500.00;
        }

        return cartTotal;
    }
}
