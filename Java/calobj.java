import java.util.*;
class cal
{
    int a,b;
    String display(cal obj)
    {
        obj.a+=10;
        obj.b+=20;
        return ("After call by value: a="+obj.a+" and b="+obj.b);
    }
}
class calobj
    {
        public static void main(String args[]) 
        {
            cal obj= new cal();
            obj.a=30;
            obj.b=40;
            System.out.println("Before call by value a="+obj.a+" and b="+obj.b);
            System.out.println(obj.display(obj));
        }
    }
