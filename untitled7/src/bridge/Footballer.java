package bridge;

public abstract class Footballer{
    FIFA fifa;

    public Footballer(FIFA fifa) {
        this.fifa = fifa;
    }

    abstract public String freeAgent();
}
