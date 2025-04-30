public class ManualStopStrategy implements StopStrategy {
    public void stop() {
        System.out.println("Stopping vehicle using manual input");
    }
}