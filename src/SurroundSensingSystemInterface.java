public class SurroundSensingSystemInterface {

    private boolean obstacleOnLeft = false;
    private boolean obstacleOnRight = false;
    private SystemAlertHandler systemAlertHandler; 
    private LeftSensor leftSensor;
    private RightSensor rightSensor;
    private AutonomousCarController autonomousCarController;

    public SurroundSensingSystemInterface(SystemAlertHandler systemAlertHandler) {
        this.systemAlertHandler = systemAlertHandler;
        this.leftSensor = new LeftSensor(this.systemAlertHandler);
        this.rightSensor = new RightSensor(this.systemAlertHandler);
    }

    public void setDependency(AutonomousCarController autonomousCarController){
        this.autonomousCarController = autonomousCarController;
    }

    public boolean checkForLeftTurn(){
        obstacleOnLeft = this.leftSensor.isObstacleDetected();
        return !obstacleOnLeft;
    }

    public boolean checkForRightTurn(){
        obstacleOnRight = this.rightSensor.isObstacleDetected();
        return !obstacleOnRight;
    }
}
