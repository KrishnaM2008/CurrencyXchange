public class EngCurr extends currency {
    public String type;
    public EngCurr(double amount, String newCurrency) {
        super(amount);
        type = newCurrency;
    }

    @Override
    public double getExchange(){
        switch (type) {
            case "Pounds Sterling" -> {
                return 1.0;
            }
            case "USD" -> {
                return 1.27;
            }
            case "INR" -> {
                return 105.94;
            }
            case "YEN" -> {
                return 204.12;
            }
            default -> {
            }
        }
        return 0.0;
    }
}