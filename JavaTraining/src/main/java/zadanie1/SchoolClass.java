package zadanie1;

import java.util.HashSet;
import java.util.Set;

public class SchoolClass {

    private Teacher teacher;
    private Set<Student> students = new HashSet<>();

    public SchoolClass(Teacher teacher, Set<Student> students) {
        this.teacher = teacher;
        this.students = students;
    }

    public void addStudent(Student student){
        students.add(student);
    }
    public void removeStudent(Student student) {
        students.remove(student);
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public Set<Student> getStudents() {
        return students;
    }
}
