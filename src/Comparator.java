import java.util.Arrays;

public class Comparator {
    public static class Student {
        String name;
        int age;
        int id;

        public Student(String name, int age, int id) {
            this.name = name;
            this.age = age;
            this.id = id;
        }
    }

    public static class IdAscendingComparator implements java.util.Comparator<Student> {
        @Override
        public int compare(Student o1, Student o2) {
            return o2.id - o1.id;
        }
    }
    public static class IdAscendingComparator2 implements java.util.Comparator<Student> {
        @Override
        public int compare(Student o1, Student o2) {
            return o1.id - o2.id;
        }
    }

    public static void printStudents(Student[] students) {
        for (Student student : students) {
            System.out.println("Name : " + student.name + ", Age : " + student.age + ", Id : " + student.id);
        }
        System.out.println("===========================");
    }

    public static void main(String[] args) {
        Student student1 = new Student("A", 1, 23);
        Student student2 = new Student("B", 2, 21);
        Student student3 = new Student("C", 3, 22);

        Student[] students = new Student[]{student3, student2, student1};
        printStudents(students);

        Arrays.sort(students, new IdAscendingComparator());
        printStudents(students);
        Arrays.sort(students, new IdAscendingComparator2());
        printStudents(students);
        printStudents(students);
        printStudents(students);
    }
}
//开大幅度发

