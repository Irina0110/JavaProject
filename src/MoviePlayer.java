/**
 * Step 11: MoviePlayer class that is a child of class Product and implements the MultimediaControl
 * interface. Includes an overloaded constructor, play, stop, previous, and next methods from
 * MultimediaControl, and a toString method for Screen and Monitor Type.
 */
// Create a class called MoviePlayer that extends Product and implements MultimediaControl
public class MoviePlayer extends Product implements MultimediaControl {

    // Add 2 fields to this class called screen and monitor type and assign appropriate types to them.
    public MonitorType monitorType;
    public Screen screen;

    public MoviePlayer(String name, Screen screen, MonitorType monitorType) {
        super(name);
        this.monitorType = monitorType;
        //this.monitorType = MonitorType.LED;
        this.screen = screen;

    }

    // Complete the methods from the MultimediaControl interface
    // in a similar fashion to the audio player.
    @Override
    public void play() {
        System.out.println("Playing movie");
    }

    @Override
    public void stop() {
        System.out.println("Stopping movie");
    }

    @Override
    public void previous() {
        System.out.println("Previous movie");
    }

    @Override
    public void next() {
        System.out.println("Next movie");
    }

    // Create a toString method that calls the product toString,
    // displays the monitor and the screen details.
    public String toString() {
        return
                super.toString() + "\n" +
                        "Screen : " + screen + "\n" +
                        "Monitor Type : " + monitorType;

    }
}