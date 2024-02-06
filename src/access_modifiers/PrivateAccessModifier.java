package access_modifiers;

/*
* 1- Private on the other hand can only be accessed in the same class.
* 2- It is not even visible to subclasses, forget about different packages.
* 3- A private class can not be accessed by anyone.*/

public class PrivateAccessModifier {
    private int marks;
    private void m1(){
        System.out.println("Hello");
    }
}
