package GenericsAndCollections;

class Student2 implements Comparable<Student2> {
    String name;
    int rn;
    double totalMark;

    Student2(String name, int rn, double totalMark) {
        this.name = name;
        this.rn = rn;
        this.totalMark = totalMark;
    }

    public String getName() {
        return name;
    }

    public int getRn() {
        return rn;
    }

    public double getTotalMark() {
        return totalMark;
    }

    @Override
    public int compareTo(Student2 otherStudent) {
        return this.rn - otherStudent.rn;
    }

    public static void bubbleSort(Student2[] students) {
        int n = students.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (students[j].compareTo(students[j + 1]) > 0) {       // Swap b/w students[j] and students[j+1]
                    Student2 temp = students[j];
                    students[j] = students[j + 1];
                    students[j + 1] = temp;
                }
            }
        }
    }
}

public class prog5 {
    public static void main(String[] args) {
        Student2[] students = {
                new Student2("Pakhi", 140, 89.9),
                new Student2("Sunaina", 142, 78.0),
                new Student2("Joyeta", 141, 80.9),
                new Student2("Sushree", 144, 84.7)
        };

        Student2.bubbleSort(students);

        System.out.println("Sorted array of student objects based on roll numbers -->");
        for (Student2 student : students) {
            System.out.println("Name: "+student.getName()+", Roll Number: "+student.getRn()+", Total Marks: "+student.getTotalMark());
        }
    }
}