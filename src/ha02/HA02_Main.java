package ha02;

import ha02.a3.Email;
import ha02.a3.Inbox;

public class HA02_Main {
    public static void main(String[] args) {
        Inbox inbox = new Inbox();

        Email mail1 = new Email(
                "sender1",
                "subject1",
                "message1",
                "datetime1",
                false
        );

        Email mail2 = new Email(
                "sender2",
                "subject2",
                "message2",
                "datetime2",
                false
        );

        Email mail3 = new Email(
                "sender3",
                "subject3",
                "message3",
                "datetime3",
                false
        );

        inbox.addMail(mail1);
        inbox.addMail(mail2);
        inbox.addMail(mail3);

        mail1.setRead(true);

        System.out.println(inbox.countUnread());

        System.out.println(mail1.print());
        for(String string: inbox.printAllEmails()){
            System.out.println("Emails: "+ string);
        }
    }
}
