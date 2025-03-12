package assignment2;


    class Book {
        private String bookId;
        private String bookName;
        private double price;

        // Constructor
        public Book(String bookId, String bookName, double price) {
            this.bookId = bookId;
            this.bookName = bookName;
            this.price = price;
        }

        // Getter methods
        public String getBookId() {
            return bookId;
        }

        public String getBookName() {
            return bookName;
        }

        public double getPrice() {
            return price;
        }

        // Override toString() method
        @Override
        public String toString() {
            return "Book ID: " + bookId + ", Book Name: " + bookName + ", Price: $" + price;
        }

        // Override equals() method to compare books based on price
        @Override
        public boolean equals(Object obj) {
            if (this == obj) return true;
            if (obj == null || getClass() != obj.getClass()) return false;
            Book book = (Book) obj;
            return Double.compare(book.price, price) == 0; // Compare prices
        }
    }

public class q2 {
        public static void main(String[] args) {
            // Instantiate two Book objects
            Book book1 = new Book("B001", "Java Programming", 29.99);
            Book book2 = new Book("B002", "Python Programming", 29.99);

            // Print the details of both books
            System.out.println(book1);
            System.out.println(book2);

            // Compare the books based on their price
            if (book1.equals(book2)) {
                System.out.println("Both books have the same price.");
            } else {
                System.out.println("The books have different prices.");
            }
        }
    }

