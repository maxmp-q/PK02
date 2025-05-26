package ha02.a3;

import java.util.ArrayList;

public class Inbox {
    ArrayList<Email> emails = new ArrayList<>();

    public Inbox(){}

    public void addMail(Email e){
        emails.add(e);
    }

    public void removeMail(Email e){
        emails.remove(e);
    }

    public ArrayList<String> printAllEmails(){
        ArrayList<String> printedMails = new ArrayList<>();

        for (Email email : emails) {
            printedMails.add(
                    (email.isRead() ? "Read" : "Unread") + " | " +
                    email.getSubject() + " | " +
                    email.getSenders_address() + " | " +
                    email.getDatetime());
        }

        return printedMails;
    }

    public String open(int index){
        try{
            if(index < emails.size()){
                return emails.get(index).print();
            }
        } catch(IndexOutOfBoundsException e) {
            throw new IndexOutOfBoundsException();
        }
        return null;
    }

    public int countUnread(){
        int i = 0;

        for(Email email : emails){
            if(!email.isRead()){
                i++;
            }
        }
        return i;
    }
}
