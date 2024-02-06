package access_modifiers.test;

import access_modifiers.DefaultAccessModifier;

public class DefaultDemo {
    DefaultAccessModifier defaultAccessModifier = new DefaultAccessModifier();
    public void test(){
        //defaultAccessModifier.age =10; //gives error
    }
}
