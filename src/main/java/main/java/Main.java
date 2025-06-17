package main.java;

enum Day { MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY; }

public class Main {
    public static void main(String[] args) {
        Day day = Day.WEDNESDAY;

        int numLetters = switch (day) {
            case MONDAY, FRIDAY, SUNDAY -> 6;
            case TUESDAY -> 7;
            case THURSDAY, SATURDAY -> 8;
            case WEDNESDAY -> 9;
            default -> throw new IllegalStateException("Invalid day: " + day);
        };

        System.out.println("Anzahl der Buchstaben: " + numLetters);
    }

    public static void main2(String[] args) {
        Student student = new Student(25);

        System.out.println(student.age());
    }

    public static void main3(String[] args) {
        Test test = new Test();

        Test.tester1 tester = new Test.tester1();
        Test.tester2 tester2 = test.new tester2();

    }
}