public class RoadSignReadingSystem {
    private RoadSignSensor roadSignSensor;
    private SystemAlertHandler systemAlertHandler; 

    public RoadSignReadingSystem(SystemAlertHandler systemAlertHandler) {
        this.systemAlertHandler = systemAlertHandler;
        this.roadSignSensor = new RoadSignSensor(this.systemAlertHandler);
    }

    public boolean isClearToTurnLeft(){
        return roadSignSensor.checkLeftRoadSign();
    }

    public boolean isClearToTurnRight(){
        return roadSignSensor.checkRightRoadSign();
    }
}
