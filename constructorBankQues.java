//create a class banaccount with field account and balance 
//•write a constructor to initialize these value
//•write a method to deposit and withdrow money


import java.util.*;
public class constructorBankQues {
    int accountNo;
    int balance; 
    public constructorBankQues(int acc,int bal){
        accountNo =acc;
        balance=bal;    
    }
    public void deposit(int deposit){
        balance =deposit +balance;
        System.out.println(deposit +"deposit current balance"+balance);
    }
    public void withdrow(int withdrow){
        if(balance>=withdrow){
            balance =balance -withdrow;
        System.out.println(withdrow+"withdrow current balance"+balance);
        }
        else{
            System.out.println("insufficient balance");
        }
    }
    public void display(int accountNo,int balance){
        System.out.println("account number"+accountNo);
        System.out.println("balance"+balance);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the account number");
        int acc =sc.nextInt();
        System.out.println("enter the balance");
        int bal=sc.nextInt();
        System.out.println("enter the deposit ammount");
        int dep=sc.nextInt();
        System.out.println("enter the withdrow ammount");
        int amm=sc.nextInt();
        constructorBankQues cs=new constructorBankQues(acc,bal);
        cs.display(acc,bal);
        cs.deposit(dep);
        cs.withdrow(amm);
;       sc.close();
    }
}
