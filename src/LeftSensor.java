public class LeftSensor extends Sensor {
   private SurroundSensingSystemInterface surroundSensingSystemInterface;

   public void setDependencies(SurroundSensingSystemInterface surroundSensingSystemInterface){
      this.surroundSensingSystemInterface = surroundSensingSystemInterface;
   }

   public LeftSensor() {
      super("LeftSensor");
   }

   boolean isObstacleDetected() {
      return false;
   }

   public void triggerAlert() {
      Alert alert = new Alert(this.getDeviceId(), Alert.Severity.HIGH);
      surroundSensingSystemInterface.alert(alert);
   }
}
