/**
 * Step 6: Driver class for AudioPlayer
 */

// Create a driver class for AudioPlayer that will test to see whether we can instantiate
// occurrences of it, use the media controls and print out their details to the console.
public class AudioPlayerDriver {

    public static void testAudioPlayer() {

        AudioPlayer a1 = new AudioPlayer("iPod Mini", "MP3");
        a1.play();
        a1.stop();
        a1.next();
        a1.previous();
        System.out.println(a1.toString());

        AudioPlayer a2 = new AudioPlayer("Walkman", "WAV");
        System.out.println(a2.toString());

    }

}