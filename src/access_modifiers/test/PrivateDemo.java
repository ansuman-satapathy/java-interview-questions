package access_modifiers.test;

import access_modifiers.PrivateAccessModifier;

public class PrivateDemo {
    PrivateAccessModifier privateAccessModifier = new PrivateAccessModifier();
    public void m2(){
        // privateAccessModifier.m1();       //gives error
        // privateAccessModifier.marks = 10; //gives error
    }
}
