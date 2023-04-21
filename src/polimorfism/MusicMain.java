package polimorfism;
import polimorfism.ClassicMusic;
import polimorfism.PopMusic;
import polimorfism.RockMusic;
import polimorfism.MusicStyles;
class Band {
    public String name;
    public MusicStyles style;
    public Band( String bandName, MusicStyles bansStyle) {
        name=bandName;
        style=bansStyle;
    }
}
public class MusicMain {
    public static void main(String[] args) {
        Band[]bandArray = {
                new Band("Linkin Park", new RockMusic()),
                new Band("Mozart",new ClassicMusic()),
                new Band("Michael Jackson",new PopMusic())
        };
        for (Band band:bandArray) {
            band.style.playMusic();
        }

    }

}

