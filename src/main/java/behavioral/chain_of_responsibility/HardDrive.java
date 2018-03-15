package behavioral.chain_of_responsibility;

import java.util.HashMap;
import java.util.Map;

public class HardDrive implements ChainItem {

    private ChainItem nextInChain;
    private Log log;

    public HardDrive(Log log) {
        this.log = log;
    }

    @Override
    public void setNext(ChainItem nextInChain) {
        this.nextInChain = nextInChain;
    }

    @Override
    public void play(String isan) {
        log.player("HardDrive");
        Movie movie = findMovie(isan);
        if(movie != null) {
            movie.play();
        } else {
            log.player(null);
            System.out.println("The Movie with ISAN '" + isan + "' does not exists in any Movie player.");
        }
    }

    private Movie findMovie(String isan) {
        return movies().get(isan);
    }

    private Map<String, Movie> movies() {
        //Mocked data
        Map<String, Movie> movies = new HashMap<>();
        String isan = "0000-0004-11CB-000A-Q-0000-0000-I";
        movies.put(isan, new Movie(isan));
        isan = "0000-0003-F0C5-0017-E-0000-0000-J";
        movies.put(isan, new Movie(isan));
        isan = "0000-0004-383F-0003-F-0000-0000-K";
        movies.put(isan, new Movie(isan));
        isan = "0000-0004-3640-0008-1-0000-0000-L";
        movies.put(isan, new Movie(isan));
        return movies;
    }
}
