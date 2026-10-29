package solid.srp;

// Class for serving email related operations
public class EmailService {

    public void createEmail() {
        System.out.println("Creating email...");
    }

    public void validateEmail() {
        System.out.println("Validating email...");
    }

    public void sendEmail(
            String toEmail,
            String subject,
            String messageBody
    ) {

        System.out.println("Sending email...");
        System.out.println("To: " + toEmail);
        System.out.println("Subject: " + subject);
        System.out.println("Message: " + messageBody);

        System.out.println("\nEmail sent successfully!");
    }

    public void saveEmailLog() {
        System.out.println("Saving email log...");
    }
}