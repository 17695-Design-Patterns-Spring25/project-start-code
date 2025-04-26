public class TrafficSensor extends Sensor{
    private SystemAlertHandler systemAlertHandler;
    private Signal signal;

    public TrafficSensor(Signal signal, SystemAlertHandler systemAlertHandler) {
        super("TrafficSensor");
        this.signal = signal;
        this.systemAlertHandler = systemAlertHandler;
    }
    
    private void raiseAlert(){
        Alert alert = new Alert(this.getDeviceId(), Alert.Severity.HIGH);
        systemAlertHandler.handleAlert(alert);
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


}
