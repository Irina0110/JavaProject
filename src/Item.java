/**
 * Step 1: Interface for Item.
 */

import java.util.Date;

public interface Item {

    //  A constant called manufacturer that would be set to “OracleProduction”.
    static final String manufacturer = "OracleProduction";

    // A method setProductionNumber that would have one integer parameter
    void setProductionNumber(int productionNumber);

    // A method setName that would have one String parameter
    void setName(String name);

    // A method getName that would return a String
    String getName();

    // A method getManufactureDate that would return a Date
    Date getManufactureDate();

    //A method getSerialNumber that would return an int
    int getSerialNumber();


}