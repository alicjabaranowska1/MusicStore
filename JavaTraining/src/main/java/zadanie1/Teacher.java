package zadanie1;

public class Teacher {

    private String teacherName;
    private String teacherSurname;

    public Teacher(String teacherName, String teacherSurname) {
        this.teacherName = teacherName;
        this.teacherSurname = teacherSurname;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public String getTeacherSurname() {
        return teacherSurname;
    }
}
