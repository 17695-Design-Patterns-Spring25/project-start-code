public class TrafficSensor extends Sensor{
    private Signal signal;

    public TrafficSensor(Signal signal) {
        super("TrafficSensor");
        this.signal = signal;
    }

    public boolean checkRightSignal(){
         return signal.isRight();
    }

    public boolean checkLeftSignal(){
        return signal.isLeft();
    }

    public boolean checkStraightSignal(){
        return signal.isStraight();
    }

    public Alert getAlert(){
        return new Alert(this.getDeviceId(), Alert.Severity.HIGH);
    }
}
