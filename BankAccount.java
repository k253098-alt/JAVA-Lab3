public class BankAccount {

    String accNum;
    String accHolderName;
    double balance;

    // Constructor with balance
    BankAccount(String accNum, String accHolderName, double balance){
        this.accNum = accNum;
        this.accHolderName = accHolderName;
        this.balance = balance;
    }

    BankAccount(String accNum, String accHolderName){
        this.accNum = accNum;
        this.accHolderName = accHolderName;
        this.balance = 0;
    }

    void displayAccDetail(){
        System.out.println("Name: " + accHolderName + "\nAccount number: " + accNum + "\nBalance: " + balance + "\n-------------------");

    }

    public static void main(String[] args){
       BankAccount acc1 = new BankAccount("ab101", "Hamza Jutt", 5000);
       BankAccount acc2 = new BankAccount("ab102", "Pakistan");

        acc1.displayAccDetail();
        acc2.displayAccDetail();
    }
}
