package sty26.Student;

import java.util.Objects;

public class Student {
    private int id;
    private String name;

    public Student(int id, String name) {
        this.id=id;
        this.name=name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (!(o instanceof Student)) return false;
//        Student student = (Student) o;
//        return id == student.id &&
//                name.equals(student.name);
//    }
//
//    @Override
//    public int hashCode() {
//
//        return Objects.hash(id, name);
//    }
}
