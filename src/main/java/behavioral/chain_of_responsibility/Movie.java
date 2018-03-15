package behavioral.chain_of_responsibility;

public class Movie {

    //international-standard-audiovisual-number
    private String isan;

    public Movie(String isan) {
        this.isan = isan;
    }

    public void play() {
        System.out.println("Playing movie '" + isan + "'");
    }
}
