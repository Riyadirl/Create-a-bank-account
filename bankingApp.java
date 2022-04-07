import java.util.Scanner;

public class bankingApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //create initial accounts
        System.out.println("How many number of customers do you want to input");
        int n = sc.nextInt();
        BankApplication[] c = new BankApplication[n];
        for (int i = 0; i < c.length; i++) {
            c[i] = new BankApplication();
            c[i].openAccout();
        }
        // loop runs until number 5 is not pressed to exit
        int ch;
        do {
            System.out.println("**Banking System Application**");
            System.out.println("1. Display all account details \\n 2. Deposit the amount \\n 3. Withdraw the amount \\n 4.Exit");
            System.out.println("Enter your choice");
            ch = sc.nextInt();
            switch (ch) {
                case 1:
                    for (int i = 0; i < c.length; i++) {
                        c[i].showAccount();
                    }
                    break;
               /* case 2:
                    System.out.println("Enter account no you want to seacrh");
                    String acc_no=sc.next();
                    boolean found = false;
                    for (int i=0;i<c.length;i++){
                        found=c[i].search(acc_no);
                        if(found){
                            break;
                        }
                    if (!found) {
                        System.out.println("Search failed! Account not found");
                }
                    break;*/
                case 2:
                System.out.println("Enter account number :");
                acc_no = sc.next();
                found = false;
                for (int i = 0; i < c.length; i++) {
                    found = c[i].search(acc_no);
                    if (found) {
                        c[i].deposit();
                        break;
                    }
                }
                if (!found) {
                    System.out.println("Search failed! Account doesn't exist..!!");
                }
                break;

            case 3:
                System.out.print("Enter Account No : ");
                acc_no = sc.next();
                found = false;
                for (int i = 0; i < c.length; i++) {
                    found = c[i].search(acc_no);
                    if (found) {
                        c[i].withdrawal();
                        break;
                    }
                }
                if (!found) {
                    System.out.println("Search failed! Account doesn't exist..!!");
                }
                break;
            case 4:
                System.out.println("See you soon...");
                break;
        }
    }
        while (ch != 4);
    }
}

