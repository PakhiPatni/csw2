package GarbageCollection;
public class prog3 {

    private String name;

    public prog3(String name) {
        this.name = name;
    }

    @Override
    protected void finalize() {
        System.out.println("Garbage collected: " + name);
    }

    public static void main(String[] args) {
        prog3 obj = new prog3("Object");

        obj = null;

        System.gc();
    }
}

/**
 * OUTPUT
 *
 * Garbage collected: Object
 */