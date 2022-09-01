package zadanie1;

import java.util.HashSet;
import java.util.Set;

public class Zadanie1 {

    public static void main(String[] args) {

        Set<Student> students = new HashSet<>();
        Student student1 = new Student("Alicja", "Baranowska");
        students.add(student1);
        students.add(new Student("Jan", "Kowalski"));

        SchoolClass schoolClass = new SchoolClass(new Teacher("Bartłomiej","Kulig"),students);
        schoolClass.addStudent(new Student("Adam", "Adamski"));
        schoolClass.removeStudent(student1);

        Teacher teacher = schoolClass.getTeacher();

        System.out.printf("Klasa składa sie z nauczyciela o imieniu: %s i nazwisku: %s%n",
                teacher.getTeacherName(), teacher.getTeacherSurname());

        schoolClass.getStudents().forEach(System.out::println);



    }
}
