package ha02.a3;

public class Email {
    private String senders_address;
    private String subject;
    private String message;
    private String datetime;
    private boolean read;

    public Email(String senders_address, String subject, String message, String datetime, boolean read) {
        this.senders_address = senders_address;
        this.subject = subject;
        this.message = message;
        this.datetime = datetime;
        this.read = read;
    }

    public boolean isRead() {
        return read;
    }

    public void setRead(boolean read) {
        this.read = read;
    }

    public String print(){
        return subject + " from " + senders_address + " on " + datetime + ": " + message;
    }

    public String getSenders_address() {
        return senders_address;
    }

    public void setSenders_address(String senders_address) {
        this.senders_address = senders_address;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getDatetime() {
        return datetime;
    }

    public void setDatetime(String datetime) {
        this.datetime = datetime;
    }
}
