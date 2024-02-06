package access_modifiers;

/*
* 1- If a class/variable/method is public, that means it can be accessed from anywhere.
* 2- It can be accessed by classes in the same package or different packages as well.
* 3- We should declare methods as public most of the time. Do not declare variables as public.*/


public class PublicAccessModifier {
    public void display(){
        System.out.println("This is accessible by everyone.");
    }

    public int age; //this is also accessible to everyone, but not recommended.

    //see in PublicDemo class
}
