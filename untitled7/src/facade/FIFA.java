package facade;

public class FIFA {
    private final Barcelona forward;
    private final Barcelona goalkeeper;

    public FIFA() {
        forward = new Forward ();
        goalkeeper = new Goalkeeper ();
    }

    public void createNewForwardForBarcelonaInFIFA() {
        forward.newTransferFromUnknownClub ();
    }
    public void createNewGoalKeeperForBarcelonaInFIFA() {
        goalkeeper.newTransferFromUnknownClub ();
    }
}
