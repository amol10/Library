package library;

class Book {
    String title;
    String author;
    String ISBN;

    public void Book(String title, String author, String ISBN) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
    }
}

class Magazine extends Book {
    public void Magazine(String title, String author, String ISBN) {
        //this.Book(title, author, ISBN);
    }
}