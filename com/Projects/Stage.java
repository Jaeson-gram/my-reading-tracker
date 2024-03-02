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
        Book howSuccessfulPeopleThink = new Book("How Successful People Think", "John C. Maxwell", 123, 10);

        booksReading.add(TheCaller);
        booksReading.add(theRuthlessElimination);
        booksReading.add(howSuccessfulPeopleThink);


        BooksToRead books = new BooksToRead(booksReading);
//        books.addBooks(TheCaller);
//        books.addBooks(theRuthlessElimination);
        booksReading.add(new Book("Sailing Alone Around The World", "Joshua Slocom", 227, 30));

        books.listBooks();

        System.out.println(); //line breaker

        updateBookProgress();

    }

    public static void updateBookProgress(){
        System.out.print("--".repeat(5));
        System.out.print("Update Progress");
        System.out.println("--".repeat(5));

        Book book = new Book("", "", 0, 0);

        System.out.println("Which book did you read today?");
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
