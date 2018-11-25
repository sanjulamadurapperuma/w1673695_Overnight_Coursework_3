package com.sanjula.oop.java.overnight_3;


import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class WestminsterLibraryManager implements LibraryManager {

    private int countBooks = 0;
    private int countDVD = 0;
    private static List<LibraryItem> itemList = new ArrayList<>();

    @Override
    public void addNewItem(LibraryItem newItem) {
        if (!(itemList.size() > 150)){
            if (newItem instanceof Book){
                if(countBooks >= 100){
                    System.out.println("The library has reached the maximum " +
                            "number of books that it can store");
                } else {
                    ++countBooks;
                    itemList.add(newItem);
                    System.out.println("Book was added. There are " +
                            (100 - countBooks) + "free spaces for books remaining.");
                }
            }

            if (newItem instanceof DVD){
                if(countDVD >= 50){
                    System.out.println("The library has reached the maximum " +
                            "number of DVDs that it can store");
                } else {
                    ++countDVD;
                    itemList.add(newItem);
                    System.out.println("DVD was added. There are " +
                            (50 - countDVD) + "free spaces for DVDs remaining.");
                }
            }
        } else{
            System.out.println("The library has no free spaces remaining");
        }

    }

    @Override
    public void deleteItem(String isbn) {
        for(LibraryItem item : itemList) {

            if(item.getIsbn().equals(isbn)) {

                if (item instanceof Book){

                    itemList.remove(item);
                    --countBooks;
                    System.out.println("Book was removed. There are " +
                            (100 - countBooks) + "free spaces for books remaining.");
                }

                if (item instanceof DVD){
                    itemList.remove(item);
                    --countDVD;
                    System.out.println("DVD was removed. There are " +
                            (100 - countDVD) + "free spaces for DVD remaining.");
                }
            }
        }

    }

    @Override
    public void displayListOfItems() {
        for (LibraryItem item : itemList){
            System.out.println("ISBN : " + item.getIsbn());
            if (item instanceof Book){
                System.out.println("Type of item : Book");
            }
            if (item instanceof DVD){
                System.out.println("Type of item: DVD");
            }
            System.out.println("Title : " + item.getTitle());
        }
    }

    @Override
    public void borrowAnItem(String isbn, Reader newReader, DateTime dateTime) {
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Date date = new Date();
        System.out.println(dateFormat.format(date));

        for(LibraryItem item : itemList) {

            if(item.getIsbn().equals(isbn)) {

                if (item instanceof Book){
                    if (item.getCurrentReader() == null){
                        item.setCurrentReader(newReader);
                        item.setDateBorrowed(dateTime);
                        System.out.println("Book has been borrowed");


                    } else {
                        assert item.getCurrentReader() != null;
                        System.out.println("This book is currently " +
                                "borrowed by reader : " + item.getCurrentReader().getId());

                        //Calculation for the difference of date borrowed and date due and current date
                        int dayDifference = date.getDay() - item.getDateBorrowed().getDay();
                        int MonthDifference = date.getMonth() - item.getDateBorrowed().getMonth();
                        int yearDifference = date.getYear() - item.getDateBorrowed().getYear();
                        int hourDifference = date.getHours() - item.getDateBorrowed().getHour();
                        int minuteDifference = date.getMinutes() - item.getDateBorrowed().getMinutes();
                    }
                }

                if (item instanceof DVD){
                    if (item.getCurrentReader() == null){
                        item.setCurrentReader(newReader);
                        item.setDateBorrowed(dateTime);
                        System.out.println("DVD has been borrowed");

                    } else {
                        assert item.getCurrentReader() != null;
                        System.out.println("This DVD is currently " +
                                "borrowed by reader : " + item.getCurrentReader().getId());

                        //Calculation for the difference of date borrowed and date due and current date
                        int dayDifference = date.getDay() - item.getDateBorrowed().getDay();
                        int MonthDifference = date.getMonth() - item.getDateBorrowed().getMonth();
                        int yearDifference = date.getYear() - item.getDateBorrowed().getYear();
                        int hourDifference = date.getHours() - item.getDateBorrowed().getHour();
                        int minuteDifference = date.getMinutes() - item.getDateBorrowed().getMinutes();
                    }//End of inner if
                }//end of outer if
            }//end of first if
        }//end of for loop
    }//end of method

    @Override
    public void returnAnItem(String isbn, DateTime dateTime) {
        for(LibraryItem item : itemList) {

            if(item.getIsbn().equals(isbn)) {

                if (item instanceof Book){
                    if (item.getCurrentReader() == null){
                        item.setCurrentReader(null);
                        item.setDateBorrowed(null);
                        System.out.println("Book has been returned");

                    } else {
                        assert item.getCurrentReader() != null;
                        System.out.println("This book is currently " +
                                "borrowed by reader : " + item.getCurrentReader().getId());
                    }
                }

                if (item instanceof DVD){
                    if (item.getCurrentReader() == null){
                        item.setCurrentReader(null);
                        item.setDateBorrowed(null);
                        System.out.println("DVD has been returned");

                    } else {
                        assert item.getCurrentReader() != null;
                        System.out.println("This DVD is currently " +
                                "borrowed by reader : " + item.getCurrentReader().getId());
                    }//End of inner if
                }//end of outer if
            }//end of first if
        }//end of for loop
    }//end of method

    @Override
    public void generateReport() {
        //for items overdue and the corresponding fee
    }
}
