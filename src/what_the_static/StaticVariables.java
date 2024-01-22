package what_the_static;

public class StaticVariables {
    /*
       1- Static variables are shared by all the objects of the class it belongs to.
       2- Changing the value of the static variable will change its value for all objects.
       3- Static variables can be accessed directly through
          class reference, eg: Class.StaticVariable
       4- Static variables can be used by non-static methods.
       5- Usually, we declare instance variables as Static.
     */

    static int age;
    static String name;
    static boolean isRegistered;

    public void printValues() {
        StaticDemo staticDemo = new StaticDemo();
        staticDemo.staticExample();
        System.out.println("Name: " + name + ", " + "Age: " + age + ", " + "Registered: " + isRegistered);
    }
}

class StaticDemo {
    public void staticExample() {
        StaticVariables.age = 23;
        StaticVariables.name = "Ansuman";
        StaticVariables.isRegistered = true;
    }
}




