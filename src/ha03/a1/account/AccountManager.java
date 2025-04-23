package ha03.a1.account;

public class AccountManager {
    public static void main(String[] args){
        Account account = new Account();

        String getOwner = account.owner;
        //works, because owner is public
        //suggest to change into private and use a getter
        System.out.println(getOwner);

        //double getBalance = account.balance;
        //not working, because balance is private
        //use this:
        double getBalance = account.getBalance();
        System.out.println(getBalance);

        int getPin = account.pin;
        //works, because same package, but is not smart
        //suggest to change into private and don't make a getter
        System.out.println(getPin);

        String getInternalNode = account.internalNode;
        //works, because is same package
        //suggest to change into private and make a getter and a setter
        System.out.println(getInternalNode);

        account.changePin(4711, 1111);
        System.out.println(account.pin);
    }
}
