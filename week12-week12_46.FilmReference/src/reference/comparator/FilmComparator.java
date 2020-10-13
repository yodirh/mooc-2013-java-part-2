package reference.comparator;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import reference.domain.Film;
import reference.domain.Rating;

public class FilmComparator implements Comparator<Film> {

    Map<Film, List<Rating>> ratings;

    public FilmComparator(Map<Film, List<Rating>> ratings) {
        this.ratings = ratings;
    }
    
    //good job
    public double getAverage(Film film) {
        List<Rating> l = ratings.get(film);
        int j = 0;
        for (Rating r : l) {
            j = j + r.getValue();
        }
        double i = j / l.size();
        return i;
    }

    @Override
    public int compare(Film o1, Film o2) {
        return (int) (getAverage(o2) - getAverage(o1));
    }
}
