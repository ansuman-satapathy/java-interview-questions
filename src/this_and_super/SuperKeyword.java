package this_and_super;

import javax.crypto.spec.PSource;

public class SuperKeyword {
    /*
     * 1- If the variable names are same in super class & subclass, in order to
     *    access the variable of the super class we use super keyword
     * 2- Similarly, for same name of constructors & methods we can use super keyword to
     *    access the corresponding super class constructors & methods.*/
    static class ParentClass {
        int x = 10;
        String name = "Ansuman";

        ParentClass() {
            System.out.println("This is the super constructor.");
        }
    }


    static class ChildClass extends ParentClass {
        int x = 20;
        String name = "ansuman";

        public ChildClass() {
            super(); //calling the super constructor
        }

        public void display() {
            System.out.println(super.x); //accessing the variable with same name from super class
        }

    }
}
