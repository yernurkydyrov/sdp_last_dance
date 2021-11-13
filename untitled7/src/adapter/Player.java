package adapter;

public class Player implements MusicPlayer{
    MusicAdapter adapter;
    @Override
    public void play(String type , int duration) {
        if(type.equalsIgnoreCase ( "hip hop" ) || duration > 0){
            System.out.println ("Hip hop music is playing , duration: " + duration);
        }else if(type.equalsIgnoreCase ( "ear pods" ) || type.equalsIgnoreCase ( "dynamic" )){
            adapter = new MusicAdapter ( type );
            adapter.play ( type, duration );
        }else {
            System.out.println ("Invalid type of music, try again. " + type + " is not defined!");
        }
    }
}
