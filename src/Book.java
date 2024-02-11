public class Book {
    private String nameBook;
    private int yearPublicationBook;
    private Author author;

    public Book(String nameBook, int yearPublicationBook, Author author) {
        this.nameBook = nameBook;
        this.yearPublicationBook = yearPublicationBook;
    }


    public String getNameBook() {
        return this.nameBook;
    }

    public int getYearPublicationBook() {
        return this.yearPublicationBook;
    }

    public void setYearPublicationBook(int yearPublicationBook) {
        this.yearPublicationBook = yearPublicationBook;
    }



}

