package GarbageCollection;
public class prog5 {
    private int intValue;
    private double doubleValue;

    public void initialize(int intValue, double doubleValue) {
        this.intValue = intValue;
        this.doubleValue = doubleValue;
    }

    public void setIntValue(int intValue) {
        this.intValue = intValue;
    }

    public void setDoubleValue(double doubleValue) {
        this.doubleValue = doubleValue;
    }

    public void update(int intValueDelta, double doubleValueDelta) {
        this.intValue += intValueDelta;
        this.doubleValue += doubleValueDelta;
    }

    public static void main(String[] args) {
        prog5 obj1 = new prog5();
        obj1.initialize(20, 7.5);

        prog5 obj2 = new prog5();
        obj2.initialize(10, 7.8);

        Runtime runtime = Runtime.getRuntime();
        long totalMemoryBefore = runtime.totalMemory();
        long freeMemoryBefore = runtime.freeMemory();
        System.out.println("Total Memory before: " + totalMemoryBefore);
        System.out.println("Free Memory before: " + freeMemoryBefore);

        obj1 = null;
        obj2 = null;

        System.gc();

        long totalMemoryAfter = runtime.totalMemory();
        long freeMemoryAfter = runtime.freeMemory();
        System.out.println("Total Memory after: " + totalMemoryAfter);
        System.out.println("Free Memory after: " + freeMemoryAfter);
    }
}

/**
 * OUTPUT
 *
 * Total Memory before: 130023424
 * Free Memory before: 126959456
 * Total Memory after: 8388608
 * Free Memory after: 7576640
 */