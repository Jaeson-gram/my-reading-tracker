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

    public void setProgress(int progress) {
        this.progress = progress;
    }

    public String progress(){
        int percentage = (this.progress * 100) / pageCount() ;
        return percentage + "%";
    }
}
