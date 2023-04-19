/**
 * Step 3: Abstract class Product implements interface Item. Includes a constructor and toString
 * method. Added Comparable<Product> and compareTo method for step 14, 15, 16
 */

import java.util.Date;

// Create an abstract type called Product that will implement the Item interface
// Implement Comparable interface
public abstract class Product implements Item, Comparable<Product> {

    // compareTo method
    @Override
    public int compareTo(Product o) {
        return name.compareTo(o.getName());

    }

    // Add the following fields to Product
// int serialNumber
// String manufacturer
// Date manufacturedOn
// String name
    public Product() {

    }

    private int serialNumber;
    private String manufacturer = Item.manufacturer;
    private Date manufacturedOn;
    private String name;
    // Add an integer class variable called currentProductionNumber.
// This will store the next number to be assigned to serialNumber.
    private static int currentProductionNumber = 1;

    // Complete the methods from the interface Item.
//  public void setProductionNumber(int productionNumber);
    public void setProductionNumber(int productionNumber) {
        serialNumber = productionNumber;
    }

    //  public String getName();
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    //public Date getManufactureDate(Date date);
    public Date getManufactureDate() {
        return manufacturedOn;
    }

    //public int getSerialNumber();
    public int getSerialNumber() {
        return serialNumber;
    }

    //  Add a constructor that will take in the name of the product and set this to the field variable
// name.
// You will also assign a serial number from the currentProductionNumber.
// The currentProductionNumber should be incremented in readiness for the next instance.
// Set manufacturedOn as the current date and time;

    public Product(String name) {
        this.name = name;
        serialNumber = currentProductionNumber;
        currentProductionNumber++;
        manufacturedOn = new Date(System.currentTimeMillis());
    }

    //  Add a toString method that will return the following: (example data shown).
//  Manufacturer : OraclProduction
//  Serial Number : 1
//  Date : Thu May 14 15:18:43 BST 2015
//  Name : Product Name
    @Override
    public String toString() {
        return
                "\n" +
                        "Manufacturer : " + manufacturer + "\n" +
                        "Serial Number : " + serialNumber + "\n" +
                        "Date : " + manufacturedOn + "\n" +
                        "Name : " + name;
    }

}