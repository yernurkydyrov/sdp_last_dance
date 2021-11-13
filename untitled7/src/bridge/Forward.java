package bridge;

public class Forward extends Footballer{

    public Forward(FIFA fifa){
        super(fifa);
    }
    public String freeAgent() {
        return "His name is Dani Alves, he is a free agent " + fifa.create ();
    }
}
