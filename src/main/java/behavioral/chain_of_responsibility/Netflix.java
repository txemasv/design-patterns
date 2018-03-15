package behavioral.chain_of_responsibility;

import java.util.HashMap;
import java.util.Map;

public class Netflix implements ChainItem {

    private ChainItem nextInChain;
    private Log log;

    public Netflix(Log log) {
        this.log = log;
    }

    @Override
    public void setNext(ChainItem nextInChain) {
        this.nextInChain = nextInChain;
    }

    @Override
    public void play(String isan) {
        log.output("Netflix selected");
        Movie movie = findMovie(isan);
        if(movie != null) {
            movie.play();
        } else {
            nextInChain.play(isan);
        }
    }

    private Movie findMovie(String isan) {
        return movies().get(isan);
    }

    private Map<String, Movie> movies() {
        //Mocked data
        Map<String, Movie> movies = new HashMap<>();
        String isan = "0000-0004-A36E-0000-V-0000-0000-A";
        movies.put(isan, new Movie(isan));
        isan = "0000-0004-C206-0000-S-0000-0000-B";
        movies.put(isan, new Movie(isan));
        isan = "0000-0004-383F-0003-F-0000-0000-C";
        movies.put(isan, new Movie(isan));
        isan = "0000-0003-E6AD-0004-N-0000-0000-D";
        movies.put(isan, new Movie(isan));
        return movies;
    }
}