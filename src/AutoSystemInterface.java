public class AutoSystemInterface {


    public void turnLeft(double afterDistance){
        System.out.println("Turning left in " + afterDistance + " miles" );
    }

    public void turnRight(double afterDistance){
        System.out.println("Turning right in " + afterDistance + " miles" );
    }

    public void slightLeft(double afterDistance){
        System.out.println("Turning slight left in " + afterDistance + " miles" );
    }

    public void slightRight(double afterDistance){
        System.out.println("Turning slight right in " + afterDistance + " miles" );
    }

    public void signalLeft(){
        System.out.println("Turning left turn signal on" );
    }

    public void signalRight(){
        System.out.println("Turning right turn signal on" );
    }

    public void startEngine(){
        System.out.println("Starting engine...");
    }

    public void stop(){
        System.out.println("Stopping...");
    }

    public void applyBreak(){

    }

    public void getCurrentSpeed(){

    }

    public void changeSpeed(double deltaSpeed){

    }
}
