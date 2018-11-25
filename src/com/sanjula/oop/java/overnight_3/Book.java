package com.sanjula.oop.java.overnight_3;

import java.util.List;

public class Book extends LibraryItem {
    private List<Author> authors;
    private Publisher publisher;
    private int totalNumberOfPages;
    private String yearOfPublication;
    private boolean isPaper;//Check whether it is printed

    public Book(String isbn, String title, String sector, String edition,
                String volume, DateTime publicationDate, DateTime dateBorrowed,
                Reader currentReader, List<Author> authors, Publisher publisher,
                int totalNumberOfPages, String yearOfPublication,
                boolean isPaper) {

        super(isbn, title, sector, edition, volume, publicationDate, dateBorrowed, currentReader);
        //^^ Attributes from LibraryItem superclass in method super.
        this.authors = authors;
        this.publisher = publisher;
        this.totalNumberOfPages = totalNumberOfPages;
        this.yearOfPublication = yearOfPublication;
        this.isPaper = isPaper;
    }

    public List<Author> getAuthors() {
        return authors;
    }

    public void setAuthors(List<Author> authors) {
        this.authors = authors;
    }

    public Publisher getPublisher() {
        return publisher;
    }

    public void setPublisher(Publisher publisher) {
        this.publisher = publisher;
    }

    public int getTotalNumberOfPages() {
        return totalNumberOfPages;
    }

    public void setTotalNumberOfPages(int totalNumberOfPages) {
        this.totalNumberOfPages = totalNumberOfPages;
    }

    public String getYearOfPublication() {
        return yearOfPublication;
    }

    public void setYearOfPublication(String yearOfPublication) {
        this.yearOfPublication = yearOfPublication;
    }

    public boolean isPaper() {
        return isPaper;
    }

    public void setPaper(boolean paper) {
        isPaper = paper;
    }
}
