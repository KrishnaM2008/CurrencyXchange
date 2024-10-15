import java.util.Scanner;
    public class mainClass {
        public static double converter(currency currency, String newCurrency) {
            double initial = currency.getCash();
            double exchangeRate = currency.getExchange();
            return initial*exchangeRate;
        }
        public static void main(String[] args) throws Exception {
            String action = "";
            try (Scanner scan = new Scanner(System.in)) {
                while(!action.equals("2")){
                    System.out.println("Hello, What woul`d you like to do today? \n 1. Convert \n 2. Exit");
                    action = scan.nextLine();
                    if (action.equals("1") ) {
                        currency initial = new currency(0);
                        System.out.println("What type of currency do you want to convert?");
                        String currency = scan.nextLine();
                        System.out.println("How much " + currency + " do you want to convert?");
                        double amount = scan.nextDouble();
                        scan.nextLine();
                        System.out.println("What do you want to convert it to?");
                        String newCurrency = scan.nextLine();
                        
                        switch (currency) {
                            case "INR" -> initial = new IndianCurr(amount,newCurrency);
                            case "USD" -> initial = new USCurr(amount,newCurrency);
                            case "Pounds Sterling" -> initial = new EngCurr(amount,newCurrency);
                            case "YEN" -> initial = new JapaneseCurr(amount,newCurrency);
                            default -> System.out.println("Invalid Input");
                        }
                        System.out.println("Processing Input...");
                        System.out.println(converter(initial, newCurrency));
                    }
                    System.out.println();
                }
            }
        }
    }