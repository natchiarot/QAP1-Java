public class TestAccount {
    public static void main(String[]args) {

        // Creating two Account objects with initial balances.
        Account acc1 = new Account("ID12345", "Acc1", 5000);
        Account acc2 = new Account("ID67890", "Acc2", 4000);

        // Printing the initial balances of two Accounts.
        System.out.println("Account 1 Balance: $" + acc1.getBalance());
        System.out.println("Account 2 Balance: $" + acc2.getBalance());

        // Transfering $1000 from Account 1 to Account 2.
        acc1.transferTo(acc2,1000);

        // Printing both balances after $1000 transfer.
        System.out.println("Account 1 balance after transfer: $" + acc1.getBalance());
        System.out.println("Account 2 balance after receiving transfer: $" + acc2.getBalance());
    }
}