package com.sanjula.oop.java.overnight_3;

public class Actor extends Person {
    private int noOfMoviesActedIn;
    private int noOfAwards;


    public Actor(String fName, String lName, String dateOfBirth, String gender, String email, String address, String telNo, int noOfMoviesActedIn, int noOfAwards) {
        super(fName, lName, dateOfBirth, gender, email, address, telNo);
        this.noOfMoviesActedIn = noOfMoviesActedIn;
        this.noOfAwards = noOfAwards;
    }

    public int getNoOfMoviesActedIn() {
        return noOfMoviesActedIn;
    }

    public void setNoOfMoviesActedIn(int noOfMoviesActedIn) {
        this.noOfMoviesActedIn = noOfMoviesActedIn;
    }

    public int getNoOfAwards() {
        return noOfAwards;
    }

    public void setNoOfAwards(int noOfAwards) {
        this.noOfAwards = noOfAwards;
    }
}
