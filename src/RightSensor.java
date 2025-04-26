public class RightSensor extends Sensor {
   private SystemAlertHandler systemAlertHandler;

   public RightSensor(SystemAlertHandler systemAlertHandler) {
      super("RightSensor");
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
