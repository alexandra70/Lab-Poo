package fourth;

public class ThrillerAlbum extends Album {

    public void addSong(Song song){

        if(song.getComposer().equals("Michael Jackson")){
            if(song.getId()%2 == 0){
                this.getAlbum().add(song);
            }
        }
    }


}
