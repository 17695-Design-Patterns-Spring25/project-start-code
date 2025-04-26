public class SystemAlertHandler {

    private NavigationAlertHandler navigationAlertHandler;
    //private HumanAlertHandler humanAlertHandler; class does not yet exist
    private TrafficSignalAlertHandler trafficSignalAlertHandler;
    //private AutoAlertHandler autoAlertHandler; class does not yet exist
    private SurroundSensingAlertHandler surroundSensingAlertHandler;
    private AutoSystemInterface autoSystemInterface;
    private AutonomousCarController autonomousCarController; 

    public SystemAlertHandler(NavigationAlertHandler navigationAlertHandler, 
                            TrafficSignalAlertHandler trafficSignalAlertHandler, 
                            SurroundSensingAlertHandler surroundSensingAlertHandler,
                            AutoSystemInterface autoSystemInterface,
                            AutonomousCarController autonomousCarController) {
        this.navigationAlertHandler = navigationAlertHandler; 
        this.trafficSignalAlertHandler = trafficSignalAlertHandler;
        this.surroundSensingAlertHandler = surroundSensingAlertHandler; 
        this.autoSystemInterface = autoSystemInterface;
        this.autonomousCarController = autonomousCarController;
    }

    public void handleAlert(Alert alert){
        // implement chain of responsibility here
    }
}