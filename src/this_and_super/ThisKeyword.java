package this_and_super;

public class ThisKeyword {

    int x;
    String name;


    /**
     * 1- We can call the default constructor of the class using this keyword.
     * 2- We can also call the parameterized constructor inside default constructor
     * with this keyword.
     * 3- Whenever the name of the local and instance variables are same,we
     * use this keyword to distinguish them.
     **/

    public ThisKeyword() {
        this(10, "Calling the parameterized constructor.");
        System.out.println("This is the default constructor.");
    }

    public ThisKeyword(int x, String name) {
        //this(); // Calling the default constructor

        this.x = x; //refers to the current object/instance
        this.name = name; //refers to the current object/instance
        System.out.println(x + " " + name);

    }
}
