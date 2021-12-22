import java.util.*;
class fact
{   
   static long fact(long n){
        if (n==0)
        
            return 1;
       else

        return(n*fact(n-1));
    }
    public static void main(String[] args) {
        Scanner a=new Scanner(System.in);
        System.out.println("Enter any Number:");
       long n=a.nextInt();
        long s=fact(n);
        System.out.println("Factorial of "+n+"="+s);
    }
}
