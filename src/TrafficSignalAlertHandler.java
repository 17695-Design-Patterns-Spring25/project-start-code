public class TrafficSignalAlertHandler {
    public void processAlert(Alert.Severity severity){
        System.out.println("ALERT! " + severity + " priority issue while traffic signal sensor");
    }
}
