public class Account {

    // Private instance variables.
    private String id;
    private String name;
    private int balance = 0;

    // Constructor: initializes an account with id and name.
    public Account(String id, String name) {
        this.id = id;
        this.name = name;
    }

    // Constructor: initializes an account with id, name and balance.
    public Account(String id, String name, int balance){
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    // Getter method for account id.
    public String getID(){
        return id;
    }

    // Getter method for account name.
    public String getName(){
        return name;
    }

    // Getter method for account balance.
    public int getBalance(){
        return balance;
    }

    // Method to add an amount to account balance.
    public int credit(int amount){
        this.balance = amount + this.balance;
        return this.balance;
    }

    // Method to subtract an amount from account balance.
    public int debit(int amount){
        if (amount <= this.balance){
            this.balance = this.balance - amount;
        } else {
            System.out.println("Amount exceeded balance");
        }
    return this.balance;
    }

    // Method to transfer an amount from this account to another account.
    public int transferTo(Account another, int amount){
        if (amount <= this.balance){
            this.balance = this.balance - amount;
            another.credit(amount);
        } else {
            System.out.println("Amount exceeded balance");
        }
    return this.balance;
    }

    // Method to return the intance variables (account details) as a string.
    public String toString() {
        return("Account[id = " + this.id + ", name = " + this.name + ", balance = " + this.balance + "]");
    }
}
