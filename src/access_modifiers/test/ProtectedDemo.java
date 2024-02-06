package access_modifiers.test;

import access_modifiers.ProtectedAccessModifier;

class ProtectedDemo extends ProtectedAccessModifier {
    ProtectedAccessModifier protectedAccessModifier = new ProtectedAccessModifier();
    void met(){
        System.out.println(age);
        test();
    }
}
