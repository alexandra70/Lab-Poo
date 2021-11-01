package fourth;

import java.util.ArrayList;

public abstract class Album {

    private ArrayList<Song> album;


    public Album() {
        album = new ArrayList<Song>();
    }

    public ArrayList<Song> getAlbum(){
        return this.album;
    }

    abstract void addSong(Song song);

    void removeSong(String song){
        this.album.remove(song);
    }

    public String toString(){
        return album.toString();
    }

}
