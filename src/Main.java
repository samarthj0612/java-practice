import solid.dip.DevelopmentTeam;
import solid.dip.GitVersionControl;
import solid.isp.MenuDisplay;
import solid.isp.NonVegetarianMenu;
import solid.isp.VegetarianMenu;
import solid.lsp.Square;
import solid.ocp.CreditCardPaymentProcessor;
import solid.ocp.PayPalPaymentProcessor;
import solid.ocp.PaymentProcessor;
import solid.srp.EmailService;
import solid.srp.SupplyOrder;

public class Main {
    // Function to process payment
    public static void processPayment(PaymentProcessor processor, double amount) {
        processor.processPayment(amount);
    }

    public static void main(String[] args) {
        System.out.println("Hello and welcome!\n");

        EmailService emailService = new EmailService();

        emailService.sendEmail(
                "recipient@example.com",
                "Test Subject",
                "Hello from Java!"
        );

        System.out.println();

        SupplyOrder supplyOrder = new SupplyOrder();
        supplyOrder.orderSupplies();

        System.out.println();

        CreditCardPaymentProcessor creditCardProcessor = new CreditCardPaymentProcessor();
        PayPalPaymentProcessor payPalProcessor = new PayPalPaymentProcessor();

        processPayment(creditCardProcessor, 100.00); // Processing credit card payment
        processPayment(payPalProcessor, 150.00);     // Processing PayPal payment

        System.out.println();

        Square s = new Square(5);
        s.setWidth(10);
        System.out.println("Area: " + s.area());

        System.out.println();

        VegetarianMenu vegMenu = new VegetarianMenu();
        NonVegetarianMenu nonVegMenu = new NonVegetarianMenu();

        MenuDisplay.displayVegetarianMenu(vegMenu);
        MenuDisplay.displayNonVegetarianMenu(nonVegMenu);

        System.out.println();

        GitVersionControl git = new GitVersionControl();
        DevelopmentTeam team = new DevelopmentTeam(git);

        team.makeCommit("Initial commit");
        team.performPush();
        team.performPull();

        System.out.println();
    }
}