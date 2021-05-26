public class CreditPaymentService {
    public double calculate(int creditAmount, double rateMonth, int creditTerm) {
        int powValue = creditTerm; // степень
        double power = Math.pow((1 + rateMonth), powValue); // возведение в степень
        int monthlyPayment = (int) ((int) creditAmount * ((rateMonth * power) / (power - 1))); // формула расчета платежа
        int monthlyPaymentCreditTooEars = (int) ((int) creditAmount * ((rateMonth * power) / (power - 1))); // формула расчета платежа
        return monthlyPayment;
    }
}

