/**
 * Step 9: Class Screen implements interface ScreenSpec. Includes an overloaded constructor and a
 * toString method for Resolution, Refresh Rate, and Response time.
 */
public class Screen implements ScreenSpec {
    // Add three fields
    //String resolution, int refreshrate, int responsetime

    int responseTime;
    int refreshRate;
    String resolution;


    Screen(String resolution, int refreshRate, int responseTime) {
        this.resolution = resolution;
        this.refreshRate = refreshRate;
        this.responseTime = responseTime;
    }

    // Complete the methods from the ScreenSpec interface.
    @Override
    public int getRefreshRate() {
        return refreshRate;
    }

    @Override
    public int getResponseTime() {
        return responseTime;
    }

    @Override
    public String getResolution() {
        return resolution;
    }

    //    Add a toString method that will
    //    return the details of the 3 field in the same format as the Product Class.
    public String toString() {
        return "Resolution : " + getResolution() + "\n" +
                "Refresh rate : " + getRefreshRate() + "\n" +
                "Response time : " + getResponseTime();

    }

}

