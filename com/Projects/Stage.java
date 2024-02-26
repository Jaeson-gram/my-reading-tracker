package com.Projects;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Stage {
    public static List<Book> booksReading = new ArrayList<Book>();

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Book TheCaller = new Book("The Caller", "Chris Carter", 425, 285);
        Book theRuthlessElimination = new Book("The Ruthless Elimination of Hurry", "John Mark", 225, 57);

        booksReading.add(TheCaller);
        booksReading.add(theRuthlessElimination);


        BooksToRead books = new BooksToRead(booksReading);
//        books.addBooks(TheCaller);
//        books.addBooks(theRuthlessElimination);
        booksReading.add(new Book("Sailing Alone Around The World", "Joshua Slocom", 227, 30));

        books.listBooks();

        updateBookProgress();

    }

    public static void updateBookProgress(){
        Book book = new Book("", "", 0, 0);

        System.out.println("Which book did you read?");
        var bookName = scanner.nextLine();

        System.out.println("Oh, which page did you read up to? (eg: '256' without the '')");
        var bookProgress = scanner.nextInt();

//                System.out.println("Alright, updated!");
//              book.setName(bookName);
        book.setProgress(bookProgress);

        for (Book b : booksReading){
            if (b.name().equalsIgnoreCase(bookName)){
                b.setProgress(bookProgress);
                System.out.println("I updated your progress - " + b.bookDetails(b.name()));
                break;
            }
        }
    }

    public void addBook(Book book) {

//        System.out.println("Not sure you told me about that book before. Do you want to add it to your 'booksToRead' library? (Y/N)");
//        if (scanner.nextLine().equalsIgnoreCase("y")){
//            book.setName(bookName);
//            System.out.println("What's the name of the author?");
//            book.setAuthor(scanner.nextLine());
//            System.out.println("What's the total page count?");
//            book.setPageCount(scanner.nextInt());
//
//            booksReading.add(book);
//
//            System.out.println("I added your book. Keep reading!");
//        }
//        else {
//            System.out.println("Aye! see ya!");
//        }
//    }
//
    }


}
