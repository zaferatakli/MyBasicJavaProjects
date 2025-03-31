package BookStoreProject;

class Book {
    private int bookNumber;
    private int publicationYear;
    private String bookName;
    private String authorName;
    private double price;
    private static int counter = 1;

    public Book() {
    }

    public Book(String bookName, String authorName, int publicationYear, double price) {
        setBookName(bookName);
        setAuthorName(authorName);
        setPrice(price);
        setPublicationYear(publicationYear);
        this.bookNumber = counter++;
    }

    public int getBookNumber() {
        return bookNumber;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }

    @Override
    public String toString() {
        return "\n** Book Information **" + "\nbookNumber   =  " + bookNumber + ",\npublicationYear       =  " + publicationYear + ",\nbookName        =  " + bookName + ",\nauthorName        =  " + authorName + ",\nprice           =  " + price + "\n";
    }
}
