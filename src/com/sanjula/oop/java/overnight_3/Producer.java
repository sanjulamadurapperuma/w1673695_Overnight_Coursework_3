package com.sanjula.oop.java.overnight_3;

public class Producer extends Person {

    private int numberOfDVDProduced;

    public Producer(String fName, String lName, String dateOfBirth,
                    String gender, String email, String address,
                    String telNo, int numberOfDVDProduced) {

        super(fName, lName, dateOfBirth, gender, email, address, telNo);
        this.numberOfDVDProduced = numberOfDVDProduced;
    }

    public int getNumberOfDVDProduced() {
        return numberOfDVDProduced;
    }

    public void setNumberOfDVDProduced(int numberOfDVDProduced) {
        this.numberOfDVDProduced = numberOfDVDProduced;
    }
}
