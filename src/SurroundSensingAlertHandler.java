public class SurroundSensingAlertHandler {
    public void processAlert(Alert.Severity severity){
        System.out.println("ALERT! " + severity + " priority issue while sensing surroundings");
    }
}
