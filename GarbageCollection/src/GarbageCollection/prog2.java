package GarbageCollection;
public class prog2 {

    private String name;

    public prog2(String name) {
        this.name = name;
    }

    @Override
    protected void finalize() {
        System.out.println("Garbage collected: " + name);
    }

    public static void main(String[] args) {
        prog2 obj1 = new prog2("Object1");
        prog2 obj2 = new prog2("Object2");

        obj1 = null;
        obj2 = null;

        System.gc();
    }
}

/**
 * OUTPUT
 *
 * Garbage collected: Object2
 */