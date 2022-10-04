import java.util.Scanner;
class Account1 {
    String name;
    double balance;

    Account1(String name, double balance) {
        this.name = name;
        if (balance > 0.0)
            this.balance = balance;
    }

        void credit( double depositeamount){
            if (depositeamount > 0.0)
                balance = balance + depositeamount;
        }

        double getBalnce() {
            // System.out.println("Balace is :");
            return balance;
        }
        void debitamount( double debit){
        if(debit<=balance)
            balance=balance-debit;
        else
            System.out.println("debit amount exceeded account balance");
    }

         void setName (String name){
            this.name = name;
        }
        String getname () {
            return name;
        }
    }

    class account {
        public static void main(String[] args) {
            Account1 a1 = new Account1("arpita", 20000);
            Account1 a2=new Account1("aniri",10000);
            System.out.println(a1.getname()+" Balance:"+a1.getBalnce());
            System.out.println(a2.getname()+" Balance:"+a2.getBalnce());
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter deposite amount for a1:");
            double depositamount=sc.nextDouble();
            a1.credit(depositamount);
            System.out.println(a1.getname()+"'s"+"Balance is " + a1.getBalnce());
            System.out.println("Enter deposite amount for a2:");
            double depositamount2=sc.nextDouble();
            a2.credit(depositamount2);
            System.out.println(a2.getname()+"'s"+"Balance is " + a2.getBalnce());
            System.out.println("enter amount for withdraw from a1");
            double debit1=sc.nextDouble();
            a1.debitamount(debit1);
            System.out.println(a1.getname()+"'s  balance:"+a1.getBalnce());
            System.out.println("enter amount for withdraw from a2");
            double debit2=sc.nextDouble();
            a2.debitamount(debit2);
            System.out.println(a2.getname()+"'s  balance:"+a2.getBalnce());


        }
    }

