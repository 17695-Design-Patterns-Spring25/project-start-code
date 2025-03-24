public class SurroundSensingSystemInterface {

    private boolean obstacleOnLeft = false;
    private boolean obstacleOnRight = false;
    private LeftSensor leftSensor = new LeftSensor();
    private RightSensor rightSensor = new RightSensor();
    private AutonomousCarController autonomousCarController;

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

    public void alert(Alert alert){
        autonomousCarController.handleAlert(alert);
    }
}
