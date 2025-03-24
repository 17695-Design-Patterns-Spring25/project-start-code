import java.util.ArrayList;
import java.util.Arrays;

public class NavigationSystemInterface {

    private String navSystemRef = "";
    private ArrayList<Direction> directions;
    private AutonomousCarController autonomousCarController;

    public void setDependencies(AutonomousCarController autonomousCarController){
        this.autonomousCarController = autonomousCarController;
    }

    public void directions(GeoPoint startLoc, GeoPoint endLoc) {
        directions = new ArrayList<>(Arrays.asList(
                new Direction("turnLeft", 5.0),
                new Direction("turnRight", 10.0)));
    }

    public void startNavigation() {
        for (Direction direction : directions) {
            if (direction.getCommand().equals("turnLeft")) {
                autonomousCarController.turnLeft(direction.getDistance());
            }
            if (direction.getCommand().equals("turnRight")) {
                autonomousCarController.turnRight(direction.getDistance());
            }
            if (direction.getCommand().equals("slightLeft")) {
                autonomousCarController.slightLeft(direction.getDistance());
            }
            if (direction.getCommand().equals("slightRight")) {
                autonomousCarController.slightRight(direction.getDistance());
            }
            if (direction.getCommand().equals("stop")) {
                autonomousCarController.stop();
            }
        }
    }
}
