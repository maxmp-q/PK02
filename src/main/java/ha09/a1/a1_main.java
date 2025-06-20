package ha09.a1;

public class a1_main {

    public static void main(String[] args) {
        CoursePhase c1 = CoursePhase.NOT_STARTED;
        CoursePhase c2 = CoursePhase.ONGOING;
        CoursePhase c3 = CoursePhase.FINISHED;

        System.out.println(c1.getMessage());
        System.out.println(c2.getMessage());
        System.out.println(c3.getMessage());
    }
}