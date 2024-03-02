package com.Projects;
import java.util.List;


public class BooksToRead {

    private List<Book> bookList;
//
//    public BooksToRead() {
//    }

    public BooksToRead(List<Book> bookList) {
        this.bookList = bookList;
    }

    public void addBooks(Book book){
//        bookList.add(!bookList.contains(book)? null : book); -> No need to fill up a space with a null if the book already exists
        if (!bookList.contains(book))
            bookList.add(book);
    }

    public void listBooks(){
        if (bookList.isEmpty()) {
            System.out.println("This list is empty!");
        }
        else{
            System.out.println("Reading List:");
            for (var book : bookList) {

                System.out.printf("%s - %s %n", book.name(), book.author()); //, book.getProgress(), book.pageCount(), book.progress());
            }
        }
    }

//    public void bookDetails(String bookName){
//        for (Book book : bookList) {
//            if (book.name().equalsIgnoreCase(bookName)){
//                System.out.printf("%s - %s %s/%s (%s)%n", book.name(), book.author(), book.getProgress(), book.pageCount(), book.progress());
//            }
//        }
//    }
}
