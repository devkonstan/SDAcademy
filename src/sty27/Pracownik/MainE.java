package sty27.Pracownik;

public class MainE {

    public static void main(String[] args) {
        Employee emp = new Employee("Abhi");
        try {
            Employee emp2 = (Employee) emp.clone();
            System.out.println(emp2.getName());
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
