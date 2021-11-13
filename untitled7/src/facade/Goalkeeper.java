package facade;

public class Goalkeeper implements Barcelona{
    @Override
    public void newTransferFromUnknownClub() {
        System.out.println ("Lev is a 14-years-old new player of FC Barcelona, transfer from Russia");
    }
}
