package com.sanjula.oop.java.overnight_3;


public interface LibraryManager {
    //Add, delete, update, read attributes and methods should be put here*/
    void addNewItem(LibraryItem newItem);

    void deleteItem(String isbn);

    void displayListOfItems();

    void borrowAnItem(String isbn, Reader newReader, DateTime dateTime);

    void returnAnItem(String isbn, DateTime dateTime);

    void generateReport();

}
