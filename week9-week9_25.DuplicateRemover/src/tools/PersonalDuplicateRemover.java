package tools;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class PersonalDuplicateRemover implements DuplicateRemover {

    private Map<String, List<String>> dup;

    public PersonalDuplicateRemover() {
        this.dup = new HashMap<String, List<String>>();
    }

    @Override
    public void add(String characterString) {
        if (!dup.containsKey(characterString)) {
            dup.put(characterString, new ArrayList<String>());
        } else {
            dup.get(characterString).add(characterString);
        }

    }

    @Override
    public int getNumberOfDetectedDuplicates() {
        int i = 0;
        for (String k : dup.keySet()) {
            if (dup.get(k).size() >= 1) {
                int j = dup.get(k).size();
                i = i + j;
            }
        }
        return i;
    }

    @Override
    public Set<String> getUniqueCharacterStrings() {
        Set<String> set = new HashSet<String>();
        for (String k : dup.keySet()) {
            set.add(k);
        }
        return set;
    }

    @Override
    public void empty() {
        dup.clear();
    }

}
