package solid.ocp;

// Base class for payment processing
public abstract class PaymentProcessor {
    public abstract void processPayment(double amount); // Pure virtual function
}
