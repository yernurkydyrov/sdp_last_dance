import adapter.Player;
import bridge.Barcelona;
import bridge.Footballer;
import bridge.Forward;
import facade.FIFA;

public class Main {
    public static void main(String[] args) {
        System.out.println ("=====================BRIDGE=========================");
        Footballer footballer = new Forward ( new Barcelona () );
        System.out.println (footballer.freeAgent ());
        System.out.println ("=====================ADAPTER=========================");
        Player player = new Player ();
        player.play ( "ear pods", 100 );
        player.play ( "dynamic", 200 );
        player.play ( "aspan",0 );
        System.out.println ("=====================FACADE=========================");
        FIFA create = new FIFA ();
        create.createNewGoalKeeperForBarcelonaInFIFA ();
        create.createNewForwardForBarcelonaInFIFA ();
    }
}
