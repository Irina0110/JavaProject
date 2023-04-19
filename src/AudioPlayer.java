/**
 * Step 5: AudioPlayer class that is a child of Product and implements interface MultimediaControl.
 * Includes an overlaoded constructor, start, stop, playing, next features from MultimediaControl,
 * and a toString for audioSpec and type.
 */

// We require a concrete class that will allow us to capture the details of an audio player.
// Create a class called AudioPlayer that is a subclass of Product
// and implements the MultimediaControl interface.
public class AudioPlayer extends Product implements MultimediaControl {
// The class will have 2 fields
// String audioSpecification
// ItemType mediaType


    public String audioSpecification;
    public ItemType mediaType;

    // Create a constructor that will take in 2 parameters – name and audioSpecification.
    public AudioPlayer(String name, String audioSpecification) {
        // The constructor should call its parents constructor and also setup the media type.
        super(name);
        this.audioSpecification = audioSpecification;
        this.mediaType = ItemType.AUDIO;


    }

    // Implement the methods from the MultimediaControl interface by simply
// writing the action to the console.
    @Override
    public void play() {
        System.out.println("Playing");

    }

    @Override
    public void stop() {
        System.out.println("Stopping");

    }

    @Override
    public void previous() {
        System.out.println("Previous");

    }


    @Override
    public void next() {
        System.out.println("Next");

    }

    @Override
    public String toString() {
        return super.toString() + "\n" + "Audio Spec : " + audioSpecification + "\n" +
                "Type : " + mediaType;
    }
}