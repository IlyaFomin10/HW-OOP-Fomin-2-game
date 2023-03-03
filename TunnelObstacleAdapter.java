public class TunnelObstacleAdapter implements Obstacle {

    private final Tunnel tunnel;

    public TunnelObstacleAdapter(Tunnel tunnel) {
        this.tunnel = tunnel;
    }

    @Override
    public boolean pass(Participant participant) {
        return tunnel.pass(participant);
    }
}
