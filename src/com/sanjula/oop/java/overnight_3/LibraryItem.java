package com.sanjula.oop.java.overnight_3;

public abstract class LibraryItem {
    private String isbn;
    private String title;
    private String sector;
    private String edition;
    private String volume;
    private DateTime publicationDate;
    private DateTime dateBorrowed;
    private Reader currentReader;

    public LibraryItem(String isbn, String title, String sector, String edition,
                       String volume, DateTime publicationDate,
                       DateTime dateBorrowed, Reader currentReader) {
        this.isbn = isbn;
        this.title = title;
        this.sector = sector;
        this.edition = edition;
        this.volume = volume;
        this.publicationDate = publicationDate;
        this.dateBorrowed = dateBorrowed;
        this.currentReader = currentReader;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSector() {
        return sector;
    }

    public void setSector(String sector) {
        this.sector = sector;
    }

    public String getEdition() {
        return edition;
    }

    public void setEdition(String edition) {
        this.edition = edition;
    }

    public String getVolume() {
        return volume;
    }

    public void setVolume(String volume) {
        this.volume = volume;
    }

    public DateTime getPublicationDate() {
        return publicationDate;
    }

    public void setPublicationDate(DateTime publicationDate) {
        this.publicationDate = publicationDate;
    }

    public DateTime getDateBorrowed() {
        return dateBorrowed;
    }

    public void setDateBorrowed(DateTime dateBorrowed) {
        this.dateBorrowed = dateBorrowed;
    }

    public Reader getCurrentReader() {
        return currentReader;
    }

    public void setCurrentReader(Reader currentReader) {
        this.currentReader = currentReader;
    }
}
