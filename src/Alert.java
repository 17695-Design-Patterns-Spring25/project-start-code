public class Alert {
    private String deviceId;
    private Severity severity;

    enum Severity{
        HIGH,
        MEDIUM,
        LOW
    }

    public Alert(String deviceId, Severity severity) {
        this.deviceId = deviceId;
        this.severity = severity;
    }

    public String getDeviceId() {
        return deviceId;
    }

    public Severity getSeverity() {
        return severity;
    }
}
