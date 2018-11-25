package com.sanjula.oop.java.overnight_3;

import java.util.List;

public class Author extends Person {

    private String authorID;
    private String abbreviation;//Of author's name
    private List<String> areasOfInterest;//Author may have several

    public Author(String fName, String lName, String dateOfBirth,
                  String gender, String email, String address,
                  String telNo, String authorID, String abbreviation,
                  List<String> areasOfInterest) {
        super(fName, lName, dateOfBirth, gender, email, address, telNo);
        this.authorID = authorID;
        this.abbreviation = abbreviation;
        this.areasOfInterest = areasOfInterest;
    }

    public String getAuthorID() {
        return authorID;
    }

    public void setAuthorID(String authorID) {
        this.authorID = authorID;
    }

    public String getAbbreviation() {
        return abbreviation;
    }

    public void setAbbreviation(String abbreviation) {
        this.abbreviation = abbreviation;
    }

    public List<String> getAreasOfInterest() {
        return areasOfInterest;
    }

    public void setAreasOfInterest(List<String> areasOfInterest) {
        this.areasOfInterest = areasOfInterest;
    }
}
