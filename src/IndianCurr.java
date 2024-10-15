public class IndianCurr extends currency {
    public String type;
    public IndianCurr(double amount, String newCurrency) {
        super(amount);
        type = newCurrency;
    }

    @Override
    public double getExchange(){
        switch (type) {
            case "USD" -> {
                return 0.012;
            }
            case "Pounds Sterling" -> {
                return 0.0094;
            }
            case "INR" -> {
                return 1.0;
            }
            case "YEN" -> {
                return 1.94;
            }
            default -> {
            }
        }
        return 0.0;
    }
}
