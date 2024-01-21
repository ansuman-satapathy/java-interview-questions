package string_concatenation;

public class StringConcatenationExample {
    public void demoMethod() {
        System.out.println(1 + 1 + 1 + "Hello"); //Output: 3Hello
        System.out.println("Hello" + 1 + 1 + 1); //Output: Hello111
        System.out.println("Hello" + 1 + "User"); //Output: Hello1Hello
        System.out.println(1 + "Hello" + 1 + 1 + "User");

    }
}
