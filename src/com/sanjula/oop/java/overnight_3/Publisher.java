package com.sanjula.oop.java.overnight_3;

public class Publisher extends Person {

    private String publicationCity;
    private int numberOfBooksPublished;

    public Publisher(String fName, String lName, String dateOfBirth,
                     String gender, String email, String address,
                     String telNo, String publicationCity,
                     int numberOfBooksPublished) {

        super(fName, lName, dateOfBirth, gender, email, address, telNo);
        this.publicationCity = publicationCity;
        this.numberOfBooksPublished = numberOfBooksPublished;
    }

    public String getPublicationCity() {
        return publicationCity;
    }

    public void setPublicationCity(String publicationCity) {
        this.publicationCity = publicationCity;
    }

    public int getNumberOfBooksPublished() {
        return numberOfBooksPublished;
    }

    public void setNumberOfBooksPublished(int numberOfBooksPublished) {
        this.numberOfBooksPublished = numberOfBooksPublished;
    }
}
