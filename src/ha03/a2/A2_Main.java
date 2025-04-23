package ha03.a2;

public class A2_Main {
    public static void main(String[] args) {
        Message m1 = new Email();
        Message m2 = new SMS();

        System.out.println(m1.getType());
        System.out.println(m2.getType());
        //m1.send(); // Uncomment this line and explain what happens
        //Is not working, because send() doesnt exist in Message, so we have to down cast this statement.
        ((Email) m1).send();
    }
}
