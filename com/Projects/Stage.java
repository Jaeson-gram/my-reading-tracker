package com.Projects;

import java.util.ArrayList;
import java.util.List;

public class Stage {

    public static void main(String[] args) {
        Book TheCaller = new Book("The Caller", "Chris Carter", 425, 285);
        Book theRuthlessElimination = new Book("The Ruthless Elimination of Hurry", "John Mark", 236, 57);

        Book[] booksReading = new Book[]{
                TheCaller,
                theRuthlessElimination
        };

        BooksToRead books = new BooksToRead(List.of(booksReading));
        books.listBooks();


    }


}
