import java.util.ArrayList;

public class AutonomousCarController {
    private NavigationSystemInterface navigationSystemInterface;
    private AutoSystemInterface autoSystemInterface;
    private TrafficSignalSystemInterface trafficSignalSystemInterface;
    private SurroundSensingSystemInterface surroundSensingSystemInterface;
    private RoadSignReadingSystem roadSignReadingSystem;


    public void setDependencies(NavigationSystemInterface navigationSystemInterface,
                                AutoSystemInterface autoSystemInterface,
                                TrafficSignalSystemInterface trafficSignalSystemInterface,
                                SurroundSensingSystemInterface surroundSensingSystemInterface,
                                RoadSignReadingSystem roadSignReadingSystem){
        this.navigationSystemInterface = navigationSystemInterface;
        this.autoSystemInterface = autoSystemInterface;
        this.trafficSignalSystemInterface = trafficSignalSystemInterface;
        this.surroundSensingSystemInterface = surroundSensingSystemInterface;
        this.roadSignReadingSystem = roadSignReadingSystem ;
    }

    public void start() {
        System.out.println("Starting the car");
        autoSystemInterface.startEngine();
        navigationSystemInterface.startNavigation();
    }

    public void stop() {
        System.out.println("Destination reached, stopping the car");
    }

    public void turnLeft(Double afterDistance) {
        System.out.println("Checking signal, surroundings and road signs");

        System.out.println("Checking signal, surroundings and road signs");
        if (trafficSignalSystemInterface.getSignalToTurnLeft()
                && surroundSensingSystemInterface.checkForLeftTurn()
                && roadSignReadingSystem.isClearToTurnLeft()) {
            autoSystemInterface.signalLeft();
            autoSystemInterface.turnLeft(afterDistance);
        }
    }

    public void turnRight(Double afterDistance) {
        System.out.println("Checking signal, surroundings and road signs");
        if (trafficSignalSystemInterface.getSignalToTurnRight()
                && surroundSensingSystemInterface.checkForRightTurn()
                && roadSignReadingSystem.isClearToTurnRight()) {
            autoSystemInterface.signalRight();
            autoSystemInterface.turnRight(afterDistance);
        }
    }

    public void slightLeft(Double afterDistance) {
        System.out.println("Checking signal, surroundings and road signs");
        if (trafficSignalSystemInterface.getSignalToTurnLeft()
                && surroundSensingSystemInterface.checkForLeftTurn()
                && roadSignReadingSystem.isClearToTurnLeft()) {
            autoSystemInterface.signalLeft();
            autoSystemInterface.slightLeft(afterDistance);
        }

    }

    public void slightRight(Double afterDistance) {
        System.out.println("Checking signal, surroundings and road signs");
        if (trafficSignalSystemInterface.getSignalToTurnRight()
                && surroundSensingSystemInterface.checkForRightTurn()
                && roadSignReadingSystem.isClearToTurnRight()) {
            autoSystemInterface.signalRight();
            autoSystemInterface.slightRight(afterDistance);
        }
    }

    public void trip(GeoPoint startLoc, GeoPoint endLoc) {
        navigationSystemInterface.directions(startLoc, endLoc);
    }

    public void handleAlert(Alert alert) {
        String deviceId = alert.getDeviceId();
        switch (deviceId) {
            case "LeftSensor", "RightSensor" -> new SurroundSensingAlertHandler().processAlert(alert.getSeverity());
            case "TrafficSensor" -> new TrafficSignalAlertHandler().processAlert(alert.getSeverity());
            case "RoadSignSensor" -> new NavigationAlertHandler().processAlert(alert.getSeverity());
            default -> System.out.println("Unknown sensor alert received");
        }
    }
}
