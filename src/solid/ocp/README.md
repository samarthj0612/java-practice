### Open/Closed Principle

This principle states that "Software entities (classes, modules, functions, etc.) should be open for extension, but closed for modification" which means you should be able to extend a class behavior, without modifying it.

- Instead of modifying the existing PaymentProcessor class, a new PayPalPaymentProcessor class can be created to add PayPal support.
- This keeps the original class unchanged while extending its functionality through a new class.
- It follows the Open-Closed Principle by keeping the class closed for modification but open for extension.

