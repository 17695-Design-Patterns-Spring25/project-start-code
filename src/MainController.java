import java.text.ParseException;
import java.util.Scanner;

public class MainController {

    static CarUI carUI;
    static AutonomousCarController autonomousCarController;
    static MusicMediaUI musicMediaUI;
    static MusicSystemController musicSystemController;
    static NavigationSystemInterface navigationSystemInterface;
    static AutoSystemInterface autoSystemInterface;
    static TrafficSignalSystemInterface trafficSignalSystemInterface;
    static SurroundSensingSystemInterface surroundSensingSystemInterface;
    static RoadSignReadingSystem roadSignReadingSystem;
    static LeftSensor leftSensor;

    public static void main(String args[]) throws ParseException {

        initSystem();

        Scanner scan = new Scanner(System.in);
        while(true) {
            System.out.println("Options available:");
            System.out.println("1. To Start Car");
            System.out.println("2. Play music");
            System.out.println("3. Simulate alert");
            System.out.println("4. Exit the car!");
            System.out.println("Enter your option:");
            int choice = scan.nextInt();

            switch (choice) {
                case 1:
                    carUI.start();
                    break;
                case 2:
                    musicMediaUI.start();
                    break;
                case 3:
                    leftSensor.triggerAlert();
                    break;
                case 4:
                    return;
                default:
                    System.out.println("Wrong option selected");
            }
        }
    }
    static void initSystem() {
        carUI = new CarUI();
        autonomousCarController = new AutonomousCarController();
        musicMediaUI = new MusicMediaUI();
        musicSystemController = new MusicSystemController();
        navigationSystemInterface = new NavigationSystemInterface();
        autoSystemInterface = new AutoSystemInterface();
        trafficSignalSystemInterface = new TrafficSignalSystemInterface();
        surroundSensingSystemInterface = new SurroundSensingSystemInterface();
        roadSignReadingSystem = new RoadSignReadingSystem();
        leftSensor = new LeftSensor();

        carUI.setDependencies(autonomousCarController);
        autonomousCarController.setDependencies(navigationSystemInterface,
                autoSystemInterface, trafficSignalSystemInterface,
                surroundSensingSystemInterface, roadSignReadingSystem);
        musicMediaUI.setDependencies(musicSystemController);
        navigationSystemInterface.setDependencies(autonomousCarController);
        surroundSensingSystemInterface.setDependency(autonomousCarController);
        leftSensor.setDependencies(surroundSensingSystemInterface);
    }
}
