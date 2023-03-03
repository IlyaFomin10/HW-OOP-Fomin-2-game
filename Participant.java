public interface Participant extends CanJump, CanRun, CanSwim {

    String getName();

    default boolean pass(SwimmingPool swimmingPool) {
        return getSwim() >= swimmingPool.distance;
    }

}
