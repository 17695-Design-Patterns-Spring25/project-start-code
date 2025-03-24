import java.util.Scanner;

public class CarUI {

    AutonomousCarController autonomousCarController;

    public void setDependencies(AutonomousCarController autonomousCarController){
        this.autonomousCarController = autonomousCarController;
    }

    public void start() {
        Integer exitStatus = 0;
        while (exitStatus == 0) {
            this.displayOptions();
            exitStatus = this.readOption();
        }
        System.out.println("Exiting Car UI!");
    }


    public void displayOptions() {
        System.out.println("Welcome to the car!");
        System.out.println("Choose from the following options:");
        System.out.println("1. Start a trip");
        System.out.println("2. Start the car");
        System.out.println("3. Exit car UI");
    }

    public Integer readOption() {
        Scanner scan = new Scanner(System.in);
        Scanner scanner = new Scanner(System.in);


        System.out.println("Please select your option:");
        int choice = scan.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Enter start and end location (Geo Points)");

                GeoPoint startLoc = new GeoPoint();
                System.out.println("Start Location - latitude:");
                double start_location_lat = scanner.nextDouble();
                System.out.println("Start Location - longitude:");
                double start_location_long = scanner.nextDouble();

                startLoc.setLat(start_location_lat);
                startLoc.setLon(start_location_long);

                GeoPoint endLoc = new GeoPoint();
                System.out.println("End Location - latitude:");
                double end_location_lat = scanner.nextDouble();
                System.out.println("End Location - longitude:");
                double end_location_long = scanner.nextDouble();
                endLoc.setLat(end_location_lat);
                endLoc.setLon(end_location_long);

                autonomousCarController.trip(startLoc, endLoc);
                break;

            case 2:
                autonomousCarController.start();
                break;

            case 3:
                return 1;

            default:
                System.out.println("Wrong option selected");
        }
        return 0;
    }
}