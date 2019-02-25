package sty26.Student;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TestStudent {
    public static void main(String[] args) {
        Student janek = new Student(1, "alex");
        Student jacek = new Student(1, "alex");

        System.out.println(janek == jacek); //inny obiekt w pamieci
        System.out.println(janek.equals(jacek)); //po odkomentowaniu metody equals() -> true
        System.out.println(janek.hashCode());
        System.out.println(jacek.hashCode()); //po odkomentowaniu metody hashCode() -> taki sam jak wyzej

        Student alex = new Student(1, "Alex");
        List<Student> studentsList = new ArrayList<Student>();
        studentsList.add(alex);
        System.out.println("Arraylist size = " + studentsList.size());
        System.out.println("Arraylist contains Alex = " + studentsList.contains(alex));
        System.out.println("Arraylist contains Alex = " + studentsList.contains(new Student(1, "Alex")));

        System.out.println("********");

        Student alex1 = new Student(1, "Alex");
        Student alex2 = new Student(1, "Alex");
        Set<Student> students = new HashSet<Student>();
        students.add(alex1);
        students.add(alex2);
        System.out.println("HashSet size = " + students.size());
        System.out.println("HashSet contains Alex = " + students.contains(new Student(1, "Alex"))); //wyswietli true, bo pod spodem metoda contains odwoluje sie do equals()
    }

}
