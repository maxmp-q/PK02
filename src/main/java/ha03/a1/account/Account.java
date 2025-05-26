package ha03.a1.account;

public class Account {
    public String owner;
    private double balance;
    protected int pin;
    String internalNode; //package-private

    public Account() {
        this.owner = "test";
        this.balance = 100;
        this.pin = 4711;
        this.internalNode = "test2";
    }

    public void changePin(int oldPin, int newPin) {
        if(oldPin == this.pin){
            this.pin = newPin;
        }
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
