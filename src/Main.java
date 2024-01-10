public class Main {
    public static void main(String[] args) {
        int credit = 1000000;
        double interestRate = 0.0999;
        CreditPaymentService service = new CreditPaymentService();

        long payment = service.calculate(credit, interestRate, 12);
        System.out.println(payment + " ₽");

        payment = service.calculate(credit, interestRate, 24);
        System.out.println(payment + " ₽");

        payment = service.calculate(credit, interestRate, 36);
        System.out.println(payment + " ₽");
    }
}