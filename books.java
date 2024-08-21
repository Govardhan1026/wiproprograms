package wiproprograms;
public class books {
    private String title;
    private String author;
    private double price;

    // Constructor to initialize all attributes
    public books(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    // Constructor to initialize title and author, with default price
    public books(String title, String author) {
        this(title, author, 0.0);
    }

    // Method to apply a discount on the price
    public void applyDiscount(double discountPercentage) {
        if (discountPercentage > 0 && discountPercentage <= 100) {
            double discountAmount = (discountPercentage / 100) * price;
            price -= discountAmount;
            System.out.println("Discount applied: " + discountPercentage + "%");
        } else {
            System.out.println("Invalid discount percentage. It must be between 0 and 100.");
        }
    }

    // Method to display the details of the book
    public void displayDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: $" + price);
    }

    public static void main(String[] args) {
        // Creating an instance of Book
        books book = new books("the bhahubhali", "S.S.rajamouli", 1000);

        // Displaying book details
        book.displayDetails();

        // Applying a discount
        book.applyDiscount(10);

        // Displaying updated book details
        book.displayDetails();
    }
}
