public class Signal {
    private boolean right;
    private boolean left;
    private boolean straight;

    public Signal() {
        this.right = true;
        this.left = true;
        this.straight = true;
    }

    public boolean isRight() {
        return right;
    }

    public boolean isLeft() {
        return left;
    }

    public boolean isStraight() {
        return straight;
    }
}
