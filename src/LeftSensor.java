public class LeftSensor extends Sensor {
   private SystemAlertHandler systemAlertHandler;

   public LeftSensor(SystemAlertHandler systemAlertHandler) {
      super("LeftSensor");
      this.systemAlertHandler = systemAlertHandler;
   }
   
   private void raiseAlert() {
      Alert alert = new Alert(this.getDeviceId(), Alert.Severity.HIGH);
      systemAlertHandler.handleAlert(alert);
   }

   boolean isObstacleDetected() {
      return false;
   }
}
