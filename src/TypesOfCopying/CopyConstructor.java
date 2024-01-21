package TypesOfCopying;

public class CopyConstructor {
    int x;
    String name;

    public CopyConstructor() {
        x = 10;
        name = "Ansuman";
        System.out.println("x = " + x + " " + "name = " + name);
    }

    /**
     * Here we copy the above constructor by passing its reference in
     * the parameter of below Constructor.
     **/
    public CopyConstructor(CopyConstructor copyConstructor) {
        this.x = copyConstructor.x;
        this.name = copyConstructor.name;
        System.out.println("x = " + x + " " + "name = " + name);
    }
}
