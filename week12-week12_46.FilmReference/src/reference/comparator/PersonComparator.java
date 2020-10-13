
package reference.comparator;

import java.util.Comparator;
import java.util.Map;
import reference.domain.Person;


public class PersonComparator implements Comparator<Person>{
    
    public PersonComparator(Map<Person, Integer> peopleIdentifier){
        
    }

    @Override
    public int compare(Person o1, Person o2) {
        return o2.getName().compareTo(o1.getName());
    }
    
    
    
    
}
