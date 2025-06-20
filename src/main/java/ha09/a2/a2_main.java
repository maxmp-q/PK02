package ha09.a2;

public class a2_main {
    public static void main(String[] args) {
        Student student1 = new Student("Alice", 2, "Computer Science");
        Student student2 = new Student("Bob", 3, "Psychology");
        Student student3 = new Student("Carl", 4, "Movie");

        StudentFormatter SF1 = student -> "Student " + student.getName() + ", Year " + student.getYear();
        StudentFormatter SF2 = student -> student.getName() + " studies " + student.getMajor() + " in year " + student.getYear();

        System.out.println(SF1.format(student1));
        System.out.println(SF2.format(student1));

        System.out.println(SF1.format(student2));
        System.out.println(SF2.format(student2));

        System.out.println(SF1.format(student3));
        System.out.println(SF2.format(student3));

    }
}
