package fourth;

import java.util.ArrayList;

public class DangerousAlbum extends Album {

    public void addSong(Song song){

        boolean prim = false;
        for(int i = 2; i < song.getId()/2; i++){
            if(song.getId() / i == 0){
                prim = true;
            }
        }
        if(prim == false){
            this.getAlbum().add(song);
        }
    }

}
