package com.Projects;

public class Book {
    private String name;
    private String Author;
    private int pageCount;
    private int progress;
    private boolean isCompleted;


    public Book(String name, String author, int pageCount, int progress) {
        this.name = name;
        Author = author;
        this.pageCount = pageCount;
        this.progress = progress;

        if (progress == pageCount){
            isCompleted = true;
        }
    }

    public String name() {
        return name;
    }

    public String author() {
        return Author;
    }

    public int pageCount() {
        return pageCount;
    }

    public int getProgress() {
        return progress;
    }

    //setters
    public void setProgress(int progress) {
        this.progress = progress;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAuthor(String author) {
        Author = author;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    public String progress(){
        int percentage = (this.progress * 100) / pageCount() ;
        return percentage + "%";
    }

    public String bookDetails(String bookName){
        return String.format("%s - %s %s/%s (%s)%n", name(), author(), getProgress(), pageCount(), progress());
    }

}
