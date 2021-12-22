import java.util.*;
class cal
{
    String display(int a,int b)
    {
        a+=10;
        b+=20;
        return ("After call by value: a="+a+" and b="+b);
    }
}
class value
    {
        public static void main(String args[]) 
        {
            cal obj= new cal();
            int a=30;
            int b=40;
            System.out.println("Before call by value a="+a+" and b="+b);
            System.out.println(obj.display(a,b));
        }
    }