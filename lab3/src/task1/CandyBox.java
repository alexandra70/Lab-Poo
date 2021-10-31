package task1;

import java.util.Objects;

public class CandyBox {
    private String flavor;
    private String origin;

    public CandyBox() {

    }

    public CandyBox(String flavor, String origin) {
        this.flavor = flavor;
        this.origin = origin;
    }

    public float getVolume() {
        return 0;
    }

    public void printDim() {

    }

    @Override
    public String toString() {
        return this.flavor + ' ' + this.origin + '\n';
    }

    @Override
    public boolean equals(Object obj) {
        if(obj == this) {
            return true; //deci dc e un astfel de obiect, atunci true
        }
        //vefiic sa vad dc e o instanta a acestei clase
        if(!(obj instanceof CandyBox)) {
            return false;
        }

        if(Objects.equals(this.flavor, ((CandyBox) obj).flavor) &&
                Objects.equals(this.origin, ((CandyBox) obj).origin)) {
            return true;
        }
        return false;
    }
}
