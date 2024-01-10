public class CreditPaymentService {
    public long calculate(int credit, double interestRate, int period) {
        double payment = credit * interestRate / 12 * Math.pow(1 + interestRate / 12, period) / (Math.pow(1 + interestRate / 12, period) - 1);
        return Math.round(payment);
    }
}
