import java.util.ArrayList;

public class AutonomousCarController {
    private NavigationSystemInterface navigationSystemInterface;
    private AutoSystemInterface autoSystemInterface;
    private TrafficSignalSystemInterface trafficSignalSystemInterface;
    private SurroundSensingSystemInterface surroundSensingSystemInterface;
    private RoadSignReadingSystem roadSignReadingSystem;

    private StartStrategy startStrategy;
    private StopStrategy stopStrategy;


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

    public void startVehicle() {
        if (startStrategy != null) {
            startStrategy.start();
        }
        else {
            System.out.println("No start strategy set");
        }
    }

    public void stopVehicle() {
        if (stopStrategy != null) {
            stopStrategy.stop();
        }
        else {
            System.out.println("No stop strategy set");
        }
    }

    public void setStartStrategy(StartStrategy strategy) {
        this.startStrategy = strategy;
    }

    public void setStopStrategy(StopStrategy strategy) {
        this.stopStrategy = strategy;
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
