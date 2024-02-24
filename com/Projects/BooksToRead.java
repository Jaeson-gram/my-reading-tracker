package com.Projects;
import java.util.List;

import static java.lang.VersionProps.println;


public class BooksToRead {

    private List<Book> bookList;

    public BooksToRead(List<Book> bookList) {
        this.bookList = bookList;
    }

    public void addBooks(Book book){
//        bookList.add(!bookList.contains(book)? null : book); -> No need to fill up a space with a null if the book already exists
        if (!bookList.contains(book))
            bookList.add(book);
    }

    public void listBooks(){
        for (var book : bookList){
            System.out.printf("%s - %s %s/%s (%s)%n", book.name(), book.author(), book.getProgress(), book.pageCount(), book.progress());
            println();
        }
    }
}
