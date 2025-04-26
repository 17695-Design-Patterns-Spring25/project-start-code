public class RoadSignSensor extends Sensor {
    private SystemAlertHandler systemAlertHandler;

    public RoadSignSensor(SystemAlertHandler systemAlertHandler) {
        super("RoadSignSensor");
        this.systemAlertHandler = systemAlertHandler;
    }

    private void raiseAlert() {
        Alert alert = new Alert(this.getDeviceId(), Alert.Severity.HIGH);
        systemAlertHandler.handleAlert(alert);
    }

    public boolean checkLeftRoadSign() {
        return true;
    }

    public boolean checkRightRoadSign() {
        return true;
    }


}
