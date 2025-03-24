import java.util.ArrayList;
import java.util.Scanner;

public class MusicMediaUI {
    MusicSystemController musicSystemController;

    public void setDependencies(MusicSystemController musicSystemController){
        this.musicSystemController = musicSystemController;
    }

    public void start(){
        Integer exitStatus = 0;
        while (exitStatus == 0){
            this.displayOptions();
            exitStatus = this.readOption();
        }
        System.out.println("Exiting Music Media UI!");
    }

    public void displayOptions(){
        System.out.println("Welcome to music UI!");
        System.out.println("Choose from the following options:");
        System.out.println("1. Play Media");
        System.out.println("2. Play next Media");
        System.out.println("3. Play previous Media");
        System.out.println("4. Show favourite media list by Genre");
        System.out.println("5. Add current media to favourites");
        System.out.println("6. Skip to Media");
        System.out.println("7. Quit player");
    }

    public Integer readOption() {
        Scanner scan = new Scanner(System.in);

        System.out.println("Please select your option:");
        int choice = scan.nextInt();

        switch (choice){
            case 1:
                System.out.println("Now Playing: " + this.musicSystemController.getCurrentMedia().getName());
                break;
            case 2:
                this.musicSystemController.playNextMedia();
                System.out.println("Now Playing: " + this.musicSystemController.getCurrentMedia().getName());
                break;
            case 3:
                this.musicSystemController.playPreviousMedia();
                System.out.println("Now Playing: " + this.musicSystemController.getCurrentMedia().getName());
                break;
            case 4:
                System.out.println("Enter genre: ");
                String genre = scan.next();
                ArrayList<Media> mediaList = this.musicSystemController.getFavMediaByGenre(genre);
                this.musicSystemController.displayMediaList(mediaList);
                break;
            case 5:
                this.musicSystemController.addCurrentMediaToFav();
                System.out.println(this.musicSystemController.getCurrentMedia().getName() + " - Added to favourites.");
                break;
            case 6:
                System.out.println("Enter media name: ");
                String newName = scan.next();
                System.out.println("Enter media genre: ");
                String newGenre = scan.next();
                this.musicSystemController.skipToMedia(new Media(newName, newGenre));
                System.out.println("Now Playing: " + newName);
                break;
            case 7:
                return 1;

        }
        return 0;
    }
}
