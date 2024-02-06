package access_modifiers;

/*
* 1- If a variable or method is protected, it can be accessed in the same package by everyone.
* 2- It can be accessed in different package provided the class that's accessing it
*    is a subclass of the class the method/variable is in. */
public class ProtectedAccessModifier {
    protected int age;
    protected void test(){
        System.out.println("Hello");
    }
}
