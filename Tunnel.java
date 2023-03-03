public class Tunnel {

    private final int length;

    public Tunnel(int length) {
        this.length = length;
    }

    public boolean pass(CanRun canRun) {
        return canRun.getRun() >= length;
    }
}
