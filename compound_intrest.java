import java.util.Scanner;
class compound_intrest {
    void ci(){
        Scanner input=new Scanner(System.in);
        System.out.println("enter principal amount:");
        double principal=input.nextDouble();
        System.out.println("enter rate of intrest:");
        double rate=input.nextDouble();
        System.out.println("enter time:");
        int time=input.nextInt();
        double amount=0;
        for(int i=1;i<time;i++){
             amount=principal*(Math.pow((1+rate/100),time));

        }
        System.out.println("amount is "+amount);
        double co_i=amount-principal;
        System.out.println("compoun intrest is:"+co_i);
    }
    public static void main(String[] args){
        compound_intrest ob=new compound_intrest();
        ob.ci();

    }

}
