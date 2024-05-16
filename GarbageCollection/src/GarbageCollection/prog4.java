package GarbageCollection;
public class prog4 {

    private String name;

    public prog4(String name) {
        this.name = name;
    }

    @Override
    protected void finalize() {
        System.out.println("Garbage collected: " + name);
    }

    public static void main(String[] args) {
        new prog4("prog4");

        System.gc();
    }
}

/**
 * OUTPUT
 *
 * Garbage collected: prog4
 */