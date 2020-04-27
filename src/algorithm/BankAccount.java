package algorithm;

public class BankAccount {
    private int id;
    private int transactions;
    private double balance;

    public BankAccount(int id,
                       int transactions,
                       double balance){
        this.id=id;
        this.transactions=transactions;
        this.balance=balance;
    }
    // getter
    public int getId(){
        return id;
    }
    public int getTransactions(){
        return transactions;
    }
    public double getBalance(){
        return balance;
    }
    // setter
    public void setBalance(double balance) {
        this.balance = balance;
    }
    public void setId(int id) {
        this.id = id;
    }
    public void setTransactions(int transactions) {
        this.transactions = transactions;
    }

     public void deposit(double amount){
        double dep=getBalance()+amount;
        setBalance(dep);
        int count=getTransactions()+1;
        setTransactions(count);
     }

     public void withdraw(double amount){
        double w=getBalance();
        if(w>0){
            if(w<amount){
                System.out.println("Insufficient funds for this withdrawal. \n Your deposit is: "+w);
            } else{
                double w1=w-amount;
                setBalance(w1);
                int count=getTransactions()+1;
                setTransactions(count);
            }
        }
        System.out.println("You have insufficient funds");
    }

    public void transfer(double amount, BankAccount account){
        double transferTax=5.00;
        double bal=getBalance();
        if(bal>transferTax){
            if((bal-transferTax)<amount){
                System.out.println("The amount of money to transfer is bigger than your available money");
            }else {
                double trans = bal - transferTax - amount;
                setBalance(trans);
                double toTrans=account.getBalance()+amount;
                account.setBalance(toTrans);
                int count=getTransactions()+1;
                setTransactions(count);
                }
        }else{
            System.out.println("You have insufficient funds");
        }



    }







    public static void main(String[] args){




    }










}
