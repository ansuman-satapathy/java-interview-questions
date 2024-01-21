package constructor_overloading;

public class Demo {

    //Same Constructor name but with different number or type of arguments
    public Demo() {
        System.out.println("Constructor with no arguments.");
    }

    public Demo(int x) {
        System.out.println("Constructor with one arguments.");
    }

    public Demo(int x, int y) {
        System.out.println("Constructor with two arguments.");
    }

    public Demo(String x) {
        System.out.println("Constructor with one argument but different type.");
    }
}
