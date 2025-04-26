public class TrafficSignalSystemInterface {
    private Signal currentNearSignal;
    private TrafficSensor trafficSensor;
    private SystemAlertHandler systemAlertHandler;

    public TrafficSignalSystemInterface(SystemAlertHandler systemAlertHandler) {
        this.currentNearSignal = new Signal();
        this.systemAlertHandler = systemAlertHandler; 
        this.trafficSensor = new TrafficSensor(this.currentNearSignal, this.systemAlertHandler);
    }

    public boolean getSignalToGoStraight(){
        return trafficSensor.checkStraightSignal();
    }

    public boolean getSignalToTurnLeft(){
        return trafficSensor.checkLeftSignal();
    }

    public boolean getSignalToTurnRight(){
        return this.trafficSensor.checkRightSignal();
    }
}
