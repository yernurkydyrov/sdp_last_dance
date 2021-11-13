package adapter;

import java.util.Objects;

public class MusicAdapter implements MusicPlayer{
    ListenMusic music;

    public MusicAdapter(String type) {
        if(Objects.equals ( type , "ear pods" )){
            music = new EarPods ();
        }else if(Objects.equals ( type , "dynamic" )){
            music = new Dynamic ();
        }
    }

    @Override
    public void play(String type , int duration) {
        if(type.equalsIgnoreCase ( "ear pods" ) && duration > 0){
            music.withEarPods ( true );
        }else if(type.equalsIgnoreCase ( "dynamic" ) && duration > 0){
            music.withDynamic ( true );
        }
    }
}
