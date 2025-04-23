package ha03.a1.account2;

import ha03.a1.account.Account;

public class CompanyAccount extends Account {
    public CompanyAccount() {
        super();
    }

    public static void main(String[] args){
        CompanyAccount account = new CompanyAccount();

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
        //works, because is subclass, but is not smart
        //suggest to change into private and don't make a getter
        System.out.println(getPin);

        //String getInternalNode = account.internalNode;
        //not working, because is not same package
        //suggest to change into private and make a getter and a setter
        //System.out.println(getInternalNode);

        account.changePin(4711, 1111);
        System.out.println(account.pin);
    }
}
