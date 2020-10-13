package reference;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import reference.domain.Film;
import reference.domain.Person;
import reference.domain.Rating;

public class RatingRegister {

    Map<Film, List<Rating>> ratinglist;
    Map<Person, Map<Film, Rating>> ratinglist2;

    public RatingRegister() {

        this.ratinglist = new HashMap<Film, List<Rating>>();
        this.ratinglist2 = new HashMap<Person, Map<Film, Rating>>();

    }

    public void addRating(Film film, Rating rating) {
        if (ratinglist.containsKey(film)) {
            ratinglist.get(film).add(rating);
        } else {
            List<Rating> ll = new ArrayList<Rating>();
            ll.add(rating);
            ratinglist.put(film, ll);
        }

    }

    public List<Rating> getRatings(Film film) {
        return ratinglist.get(film);
    }

    public Map<Film, List<Rating>> filmRatings() {
        return ratinglist;
    }
    
    public void addRating(Person person, Film film, Rating rating){
        if(ratinglist2.containsKey(person)){
            ratinglist2.get(person).put(film, rating);
            addRating(film, rating);
            
        }else{
            Map<Film, Rating> m = new HashMap<Film, Rating>();
            m.put(film, rating);
            ratinglist2.put(person, m);
            addRating(film, rating);
        } 
    }
    
    public Rating getRating(Person person, Film film){
        if(!ratinglist2.get(person).containsKey(film)){
            return Rating.NOT_WATCHED;
        }
        return ratinglist2.get(person).get(film);
    }
    
    public Map<Film, Rating> getPersonalRatings(Person person){
       if(!ratinglist2.containsKey(person)){
           return new HashMap<Film, Rating>();
       }
        return ratinglist2.get(person);
    }
    
    public List<Person> reviewers(){
        List<Person> person = new ArrayList<Person>();
        for(Person p:ratinglist2.keySet()){
            person.add(p);
        }
        return person;
    }
    
    
    
    

}
