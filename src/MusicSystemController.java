import java.util.*;

public class MusicSystemController {
    private ArrayList<Media> favouriteMedia;
    private ArrayList<Media> mediaList;

    public Media getCurrentMedia() {
        return currentMedia;
    }

    private Media currentMedia;
    private Integer mediaCounter;

    public MusicSystemController() {
        favouriteMedia = new ArrayList<>();
        mediaList = new ArrayList<>(Arrays.asList(
                new Media("Shoot to thrill", "Rock"),
                new Media("Middle Child", "HipHop"),
                new Media("Blinding Lights", "Pop")));
        mediaCounter = 0;
        currentMedia = mediaList.get(mediaCounter);
    }

    public void addCurrentMediaToFav() {
        favouriteMedia.add(currentMedia);
    }

    public ArrayList<Media> getFavMediaByGenre(String genre) {
        ArrayList<Media> favMediaByGenre = new ArrayList<>();
        for (Media media : favouriteMedia){
            if (media.getGenre().equals(genre)){
                favMediaByGenre.add(media);
            }
        }
        return favMediaByGenre;
    }

    public void displayMediaList(ArrayList<Media> mediaList) {
        System.out.println("Your media list: ");
        for (Media media: mediaList){
            System.out.println(media.getName());
        }
    }

    public void playNextMedia() {
        mediaCounter++;
        currentMedia = mediaList.get(mediaCounter % mediaList.size());
    }

    public void playPreviousMedia() {
        mediaCounter--;
        currentMedia = mediaList.get(mediaCounter % mediaList.size());
    }

    public void skipToMedia(Media media) {
        currentMedia = media;
    }
}
