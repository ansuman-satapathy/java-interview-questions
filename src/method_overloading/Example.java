package method_overloading;

public class Example {
    public void doSomething(int x) {
        System.out.println("I am a method with one argument.");
    }

    public void doSomething(String x) {
        System.out.println("I am the same method with different type of arguments.");
    }

    public void doSomething(int x, String y) {
        System.out.println("I am the same method with different number of arguments.");
    }


}
