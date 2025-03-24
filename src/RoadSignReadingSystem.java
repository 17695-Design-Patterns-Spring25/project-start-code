public class RoadSignReadingSystem {
    private RoadSignSensor roadSignSensor;

    public RoadSignReadingSystem() {
        this.roadSignSensor = new RoadSignSensor();
    }

    public boolean isClearToTurnLeft(){
        return roadSignSensor.checkLeftRoadSign();
    }

    public boolean isClearToTurnRight(){
        return roadSignSensor.checkRightRoadSign();
    }

    public Alert getAlertFromSensor() {
        return roadSignSensor.getAlert();
    }
}
