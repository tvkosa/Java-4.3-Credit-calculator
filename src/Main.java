public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();

        int monthlyPayment = (int)service.calculate(1_000_000, 0.008325, 12);
        System.out.println("Eжемесячный платеж при сроке кредита 1 год:" + monthlyPayment);

        int monthlyPayment2 = (int)service.calculate(1_000_000, 0.008325, 24);
        System.out.println("Eжемесячный платеж при сроке кредита 2 года:" + monthlyPayment2);

        int monthlyPayment3 = (int)service.calculate(1_000_000, 0.008325, 36);
        System.out.println("Eжемесячный платеж при сроке кредита 3 года:" + monthlyPayment3);

    }
}

