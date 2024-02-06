package access_modifiers.test;

import access_modifiers.PublicAccessModifier;

public class PublicDemo {
    PublicAccessModifier publicAccessModifier = new PublicAccessModifier();
    void test(){
        publicAccessModifier.display();
        publicAccessModifier.age = 10;

        //we can access methods of the PublicAccessModifier class in sub-package.
        //it can be accessed in a different package as well.
    }
}
