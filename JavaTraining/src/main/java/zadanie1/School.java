package zadanie1;

import java.util.HashSet;
import java.util.Set;

public class School {

    private String name;
    private Set<SchoolClass> schoolClasses = new HashSet<>();

    public School(String name, Set<SchoolClass> schoolClasses) {
        this.name = name;
        this.schoolClasses = schoolClasses;
    }

}
