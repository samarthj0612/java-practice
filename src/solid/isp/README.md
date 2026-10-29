### Interface Segregation Principle

This principle applies to interfaces and is similar to the Single Responsibility Principle, focusing on keeping interfaces specific and well-defined. It states that clients should not be forced to depend on methods that are irrelevant to them, avoiding unnecessary dependencies. The goal is to prevent fat interfaces by using multiple small, client-specific interfaces, each with a clear and specific responsibility.

Example: Suppose if you enter a restaurant and you are pure vegetarian. The waiter in that restaurant gave you the menu card which includes vegetarian items, non-vegetarian items, drinks, and sweets.

- Customers should receive a menu relevant to their needs (e.g., vegetarian only) instead of a general menu with unnecessary items.
- Splitting a common menu into smaller, specific ones reduces unnecessary dependencies and minimizes future changes.

