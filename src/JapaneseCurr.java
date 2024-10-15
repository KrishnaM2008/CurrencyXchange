public class JapaneseCurr extends currency {
    public String type;
    public JapaneseCurr(double amount, String newCurrency) {
        super(amount);
        type = newCurrency;
    }

    @Override
    public double getExchange(){
        switch (type) {
            case "USD" -> {
                return 0.0062;
            }
            case "Pounds Sterling" -> {
                return 0.0049;
            }
            case "INR" -> {
                return 0.52;
            }
            case "YEN" -> {
                return 1.0;
            }
            default -> {
            }
        }
        return 0.0;
    }
}
