package string;

/*
      1- Strings are immutable.
      2- That means we can not change value inside the double
         quotes, otherwise known as string literals.
      3- This is because the String class is designed to be final and
         its internal state cannot be modified after construction.
      4- Reasons: Security, Thread safety, Caching & Performance.
         Read more: https://www.baeldung.com/java-string-immutable
      */

/*
      **** StringBuffer ****
      1- In order to overcome the immutability of strings, we use StringBuffer.
      2- StringBuffer gives us a 16 byte buffer size.
      3- If we assign a 5 byte string to a StringBuffer object, the total capacity of the
         StringBuffer object becomes 21 now.  */

public class MyStringBuffer {
    StringBuffer stringBuffer = new StringBuffer("Original");

    public void demoMethod() {
        System.out.println(stringBuffer.capacity()); //24
        stringBuffer.append(" Appended"); //Modifying Strings
        System.out.println(stringBuffer);
        System.out.println(stringBuffer.capacity()); //24 (Appending does not increase the size)
        String str = stringBuffer.toString(); //Converting to String
        System.out.println(stringBuffer.append(" Long " + 1224573523444443232L));
        System.out.println(stringBuffer.insert(23, "Inserted String "));
    }
}
