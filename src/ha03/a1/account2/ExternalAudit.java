package ha03.a1.account2;

import ha03.a1.account.Account;

public class ExternalAudit {
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

        //int getPin = account.pin;
        //not working, because is not same package nor a subclass
        //suggest to change into private and don't make a getter
        //System.out.println(getPin);

        //String getInternalNode = account.internalNode;
        //not working, because is not same package
        //suggest to change into private and make a getter and a setter
        //System.out.println(getInternalNode);
    }
}
