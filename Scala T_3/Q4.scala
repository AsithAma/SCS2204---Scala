object Question2 {

    // Total price of all books
    def book_price(amount: Int): Double = {
        amount * 24.95
    }

    // Discount for all the books
    def discount(price: Double): Double = {
        price * 0.4
    }

    // Total shipping cost for all the books
    def shipping(amount: Double): Double = {
        3*amount + (amount - 50)*0.75
    }

    def main(args: Array[String]): Unit = {
        print("Enter the number of books: ");
        var amount = scala.io.StdIn.readInt();

        print("Total wholesale cost for " + amount + " copies = " + (book_price(amount) - discount(book_price(amount)) + shipping(amount)) );
    }
}