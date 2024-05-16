package OOPS;
class Employee {
    private String name;
    private int age;
    private int eId;
    private String position;

    Employee() {
        this.eId = 4928;
        this.position = "SDE";
    }

    void setName(String name) {
        this.name = name;
    }

    void setAge(int age) {
        this.age = age;
    }

    String getName() {
        return this.name;
    }

    int getAge() {
        return this.age;
    }

    String printToString() {
        return this.name+"'s age is "+this.age+", his Employee ID is "+this.eId+" & assigned in Position "+this.position;
    }
 }

public class prog2 {
    public static void main(String[] args) {
        Employee e1 = new Employee();
        e1.setName("PAKHI");
        e1.setAge(19);
        System.out.println(e1.printToString());
    }
}
