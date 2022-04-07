import java.util.Scanner;

public class BankApplication {
    //public boolean length;
    String name;
    String acc_type;
    String acc_no;
    long balance;
    Scanner sc = new Scanner(System.in);

    //method to open new account
    public void openAccout(){
        System.out.print("Enter account name :");
        name = sc.nextLine();
        System.out.print("Enter account type :");
        acc_type = sc.next();
        System.out.print("Enter account no :");
        acc_no = sc.next();
        System.out.print("Enter Balance :");
        balance = sc.nextLong();
    }
    //method to display account details
    public void showAccount(){
        System.out.println("Name of account holder :"+name);
        System.out.println("Account no :"+acc_no);
        System.out.println("Account type:"+acc_type);
        System.out.println("Balance :"+balance);
    }
    //method to diposit money
    public void deposit(){
        long amount;
        System.out.println("Enter the amount you want to deposit");
        amount=sc.nextLong();
        balance=balance+amount;
    }
    //method to withdraw money
    public void withdrawal(){
        long amount;
        System.out.println("Enter the amount you want to withdrawal");
        amount =sc.nextLong();
        if(balance>=amount){
            balance = balance -amount;
            System.out.println("Balance after withdrawal :"+balance);
        }
        else {
            System.out.println("Your balance is less than "+amount+"\tTransaction failed..!");
        }
    }
   /* public boolean search(String acc_no){
        if(acc_no.equals(acc_no)){
            showAccount();
            return (true);
        }
        return (false);*/
    }

