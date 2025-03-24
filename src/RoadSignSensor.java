public class RoadSignSensor extends Sensor {
    public RoadSignSensor() {
        super("RoadSignSensor");
    }

    public boolean checkLeftRoadSign() {
        return true;
    }

    public boolean checkRightRoadSign() {
        return true;
    }

    public Alert getAlert() {
        return new Alert(this.getDeviceId(), Alert.Severity.HIGH);
    }
}
