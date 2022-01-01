import java.util.*;
import java.math.*;
public class as1A3 {
    public void volume()
    {
        System.out.println("_________________Calculate Volume of cylinder_________________");
        Scanner v=new Scanner(System.in);
        
        System.out.println("Enter Radius:");
        int r=v.nextInt();
        System.out.println("Enter Height:");
        int h=v.nextInt();
        double vol=Math.PI*(r*r)*h;
        System.out.println("Volume of Cylinder:"+vol);
    }
    public void fact()
    {

        System.out.println("_________________Calculate Factorial_________________");
        Scanner f=new Scanner(System.in);
        
        System.out.println("Enter a Number:");
        int ft=f.nextInt();
        long q=1;
        for(int i=1;i<ft;i++){
            q=q*i;
        }
        System.out.println("Factorial a Number:"+q);
    }
    public void arm()
    {
        System.out.println("_________________To Check Armstrong Number_________________");
        Scanner ar=new Scanner(System.in);
        
        System.out.println("Enter a Number:");
        int ars=ar.nextInt();
        int on,rmdr,res=0;
        on=ars;
        while(on!=0)
        {
            rmdr=on%10;
            res+=Math.pow(rmdr, 3);
            on/=10;
        }
        if (res==ars)
        System.out.println(ars+" is Armstrong number");
        else
        System.out.println(ars+" is NOT Armstrong number");        
    }
    public static void main(String[] args) {
        as1A3 obj=new as1A3();
        System.out.println("_________________Welcome_________________");
        System.out.println("please select operation from following:\n1)Enter '1' for Calculate the volume of the cylinder:\n2)Enter '2' to find factorial of number:\n3)Enter '3' to check Armstrong Number:\n4)Enter '4' for EXIT:");
        Scanner s1=new Scanner(System.in);
        int accept=s1.nextInt();
        switch (accept) {
            case 1:
               obj.volume();
               break;
            case 2:
                obj.fact();
                break;
            case 3:
                obj.arm();
                break;
            case 4:
                break;
            default:
                break;
        }
        

        
    }
}
