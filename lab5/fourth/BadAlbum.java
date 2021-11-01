package fourth;

public class BadAlbum extends Album{

    public void addSong(Song song){

        if(song.getNume().length() == 3){
            int rev = 0;
            int copy = song.getId();
            while(copy > 0){
                rev = rev*10 + copy%10;
                copy = copy/10;
            }
            if(rev == song.getId()){
                this.getAlbum().add(song);
            }
        }
    }
}
