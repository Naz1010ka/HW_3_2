public class LimitException extends Throwable {

    private String message;
    private  double remainingAmout;

    public double getRemainingAmout() {
        return remainingAmout;
    }

    public LimitException(String message, double remainingAmout) {
        this.message = message;
        this.remainingAmout = remainingAmout;
    }
}
