package method_overriding;

public class Child extends Parent {

    @Override
    public void parentMethod() {
        System.out.println("I am Child method."); //Method Definition Overridden
    }
}
