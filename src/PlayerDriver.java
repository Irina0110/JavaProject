/**
 * Step 13: Driver class for the MoviePlayer and AudioPlayer class with play, stop, next, previous
 * methods.
 */
public class PlayerDriver {

    //public void test
    public static void testPlayer() {
        MultimediaControl mc1 = new AudioPlayer("Ipod", "MP3");
        MultimediaControl mc2 = new MoviePlayer("DBPOWER MK101", new Screen("720x480",
                44, 44), MonitorType.TYPE);
        mc1.next();
        mc1.play();
        mc1.previous();
        mc1.stop();
        mc2.next();
        mc2.play();
        mc2.previous();
        mc2.stop();
    }
}