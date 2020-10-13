
package personnel;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Employees {
    
    List<Person> person;
    
    public Employees(){
        this.person = new ArrayList<Person>();
        
    }
    
    public void add(Person person){
        this.person.add(person);
    }
    
    public void add(List<Person> person){
        for(Person p:person){
            add(p);
        }
    }
    
    public void print(){
        Iterator<Person> iterator = this.person.iterator();
        while(iterator.hasNext()){
            Person nextPerson = iterator.next();
            System.out.println(nextPerson);
        }
    }
    
    public void print(Education education){
        Iterator<Person> iterator = this.person.iterator();
        while(iterator.hasNext()){
            Person nextPerson = iterator.next();
            if(nextPerson.getEducation() == education){
                System.out.println(nextPerson);
            }
        }
    }
    
    public void fire(Education education){
        Iterator<Person> iterator = this.person.iterator();
        while(iterator.hasNext()){
            Person nextPerson = iterator.next();
            if(nextPerson.getEducation() == education){
                iterator.remove();
            }
        }
    }
}
