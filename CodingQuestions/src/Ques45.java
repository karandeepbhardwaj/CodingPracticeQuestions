class SuperClass {
     void foo() {}
}
class Child extends SuperClass {
     void foo() {}
}
public class Ques45 {
    public static void main(String args[]) {
        Child child = new Child();
        child.foo();
    }
}
