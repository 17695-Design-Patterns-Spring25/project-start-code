public class Direction {
    private String command;
    private Double distance;

    public Direction(String command, Double distance) {
        this.command = command;
        this.distance = distance;
    }

    public String getCommand() {
        return command;
    }

    public Double getDistance() {
        return distance;
    }


}
