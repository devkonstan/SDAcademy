package lis10;

public class Instance {
        public static void main(String[] args) {
            Parent obj1 = new Parent();
            Parent obj2 = new Child();
            System.out.println("obj1 instanceof lis10.Parent: "
                    + (obj1 instanceof Parent));
            System.out.println("obj1 instanceof lis10.Child: "
                    + (obj1 instanceof Child));
            System.out.println("obj1 instanceof lis10.MyInterface: "
                    + (obj1 instanceof MyInterface));
            System.out.println("obj2 instanceof lis10.Parent: "
                    + (obj2 instanceof Parent));
            System.out.println("obj2 instanceof lis10.Child: "
                    + (obj2 instanceof Child));
            System.out.println("obj2 instanceof lis10.MyInterface: "
                    + (obj2 instanceof MyInterface));
        }
    }

    class Parent {}
    class Child extends Parent implements MyInterface {} //lis10.Child jest podklasa lis10.Parent rozsz przez lis10.MyInterface
    interface MyInterface {}

