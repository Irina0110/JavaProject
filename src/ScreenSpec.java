/**
 * Step 8: Interface ScreenSpec. Includes 3 methods.
 */
// Create an interface called ScreenSpec.  This will define 3 methods:
// public String getResolution();
// public int getRefreshRate();
// public int getResponseTime();
public interface ScreenSpec {

    int getRefreshRate();

    int getResponseTime();

    String getResolution();


}