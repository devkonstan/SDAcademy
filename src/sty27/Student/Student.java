package sty27.Student;

public class Student implements Cloneable {
    int id;
    String name;
    Course course;

    public Student(int id, String name, Course course) {
        this.id = id;
        this.name = name;
        this.course = course;
    }

    @Override //prawilna metoda
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

//Default version of clone() method. It creates shallow copy of an object.
//    protected Object clone() throws CloneNotSupportedException {
//        Student student = (Student) super.clone();
//        student.course = (Course) course.clone();
//        return student;
//    }
}
