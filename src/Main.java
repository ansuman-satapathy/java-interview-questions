import string.MyStringBuffer;
import this_and_super.SuperKeyword;
import types_of_copying.CopyConstructor;
import types_of_copying.DeepCopy;
import types_of_copying.ShallowCopy;
import constructor_overloading.Demo;
import method_overloading.Example;
import method_overriding.Child;
import method_overriding.Parent;
import string.StringConcatenation;
import this_and_super.ThisKeyword;
import what_the_static.StaticMethod;
import what_the_static.StaticVariables;

public class Main {
    public static void main(String[] args) {

        //Method Overloading
        Example example = new Example();
        example.doSomething(10);
        example.doSomething(10, "Hello!");
        example.doSomething("Hello!");
        System.out.println("*************************************************");

        //Constructor Overloading
        Demo demo1 = new Demo();
        Demo demo2 = new Demo("Hello");
        Demo demo3 = new Demo(10);
        Demo demo4 = new Demo(10, 20);
        System.out.println("*************************************************");

        //Method Overriding
        Parent parent = new Parent();
        parent.parentMethod();
        Child child = new Child();
        child.parentMethod(); //Overridden method of Parent Class
        System.out.println("*************************************************");

        //String Concatenation
        StringConcatenation stringConcatenationExample = new StringConcatenation();
        stringConcatenationExample.demoMethod();
        System.out.println("*************************************************");

        // **Types of Copying in Java** //

        //Shallow Copy(Creates a reference to the same object)
        ShallowCopy shallowCopy1 = new ShallowCopy();
        shallowCopy1.x = 10;
        ShallowCopy shallowCopy2 = shallowCopy1; //shallow copy
        shallowCopy2.x = 20;
        System.out.println(shallowCopy1.x); //outputs 20
        System.out.println(shallowCopy2.x); //outputs 20
        System.out.println("*************************************************");

        //Deep Copy(Creates a copy of the original class)
        DeepCopy deepCopy1 = new DeepCopy();
        deepCopy1.y = 50;
        DeepCopy deepCopy2 = new DeepCopy(); //deep copy
        deepCopy2.y = 100;
        System.out.println(deepCopy1.y); //outputs 50
        System.out.println(deepCopy2.y); //outputs 100
        System.out.println("*************************************************");

        //Copy Constructor
        CopyConstructor copyConstructor1 = new CopyConstructor();
        CopyConstructor copyConstructor2 = new CopyConstructor(copyConstructor1);
        System.out.println("*************************************************");

        // ************* This and Super Keywords in Java **********//

        //this keyword
        ThisKeyword thisKeyword1 = new ThisKeyword();
        ThisKeyword thisKeyword2 = new ThisKeyword(100, "Ansuman");


        //super keyword
        SuperKeyword superKeyword = new SuperKeyword();
        System.out.println("*************************************************");

        //StringBuffer
        MyStringBuffer myStringBuffer = new MyStringBuffer();
        myStringBuffer.demoMethod();
        System.out.println("*************************************************");

        //StringBuilder

        // ********* Static *********

        //Static Variables
        StaticVariables staticVariables = new StaticVariables();
        staticVariables.printValues();
        System.out.println("*************************************************");

        //Static Methods
        StaticMethod.staticMethodExample(); //Statically accessing methods
        System.out.println("*************************************************");

    }
}
