abstract class Sensor {
    private String deviceId;

    public Sensor(String deviceId) {
        this.deviceId = deviceId;
    }

    public String getDeviceId() {
        return deviceId;
    }
}
