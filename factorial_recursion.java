//when function called itself is call recursion
public class factorial_recursion {
    static int fact(int n){
        if(n==0 || n==1){
            return 1;
        }
        else{
            return n*fact(n-1);
        }
    }
    public static void main(String [] arg){
        int a=0;
        System.out.println("factorial of a is"+fact(4));
    }
}
