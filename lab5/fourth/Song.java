package fourth;

public class Song {

    private String nume;
    private int id;
    private String composer;

    public Song(String nume, int id, String composer) {
        this.nume = nume;
        this.id = id;
        this.composer = composer;
    }

    public String getNume() {
        return this.nume;
    }

    public String getComposer() {
        return this.composer;
    }

    public int getId() {
        return this.id;
    }

    //scriu cantecul
    public String toString(){
        return this.nume + " " + this.id + " " + this.composer;
    }

}
