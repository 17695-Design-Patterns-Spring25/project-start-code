public class TrafficSignalSystemInterface {
    private Signal currentNearSignal;
    private TrafficSensor trafficSensor;

    public TrafficSignalSystemInterface() {
        this.currentNearSignal = new Signal();
        this.trafficSensor = new TrafficSensor(this.currentNearSignal);
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

    public Alert getAlertFromSensor(){
        return this.trafficSensor.getAlert();
    }
}
