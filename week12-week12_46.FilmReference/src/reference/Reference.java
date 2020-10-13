
package reference;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import reference.comparator.FilmComparator;
import reference.domain.Film;
import reference.domain.Person;
import reference.domain.Rating;

public class Reference {
    
    private RatingRegister ratingregister;

    public Reference (RatingRegister ratingregister){
        this.ratingregister=ratingregister;
        
    }
    
    public Film recommendFilm(Person person){
        Map<Film, List<Rating>> rating = ratingregister.filmRatings();
        List<Film> flimlist = new ArrayList<Film>();
        
        for(Film f:rating.keySet()){
            flimlist.add(f);
        }

        FilmComparator filmcomparator = new FilmComparator(rating);
        Collections.sort(flimlist, filmcomparator);
        
        return flimlist.get(0);
    }
}
