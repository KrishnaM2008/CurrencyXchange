public class USCurr extends currency {
    public String type;
    public USCurr(double amount, String newCurrency) {
        super(amount);
        type = newCurrency;
    }

    @Override
    public double getExchange(){
        switch (type) {
            case "Pounds Sterling" -> {
                return 0.79;
            }
            case "INR" -> {
                return 83.49;
            }
            case "USD" -> {
                return 1.0;
            }
            case "YEN" -> {
                return 161.6;
            }
            default -> {
            }
        }
        return 0.0;
    }
}