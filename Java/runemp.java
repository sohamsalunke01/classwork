import java.io.*;
import java.util.*;
class emp
{
    int eid;
    String ename;
    float salary;
    public void accept()
    {
        System.out.println("Enter Employee details:");
        Scanner s1=new Scanner(System.in);
        System.out.print("Enter ID:");
        eid=s1.nextInt();
        System.out.print("\nEnter Name:");
        Scanner s2=new Scanner(System.in);
        ename=s2.nextLine();
        System.out.print("\nEnter Salary:");
        salary=s1.nextFloat();
    }
    public void display()
    {
        System.out.println("\nEmployee Details:");
        System.out.println("ID:"+eid);
        System.out.println("Name:"+ename);
        System.out.println("Basic Salary:"+salary);
    }
    public void calsal() 
    {
        double hra,totalsal,da,pf,it,ta;
        hra=salary * 0.12;
        da=salary * 0.8;
        ta=salary * 0.10;
        pf=salary * 0.12;
        it=salary * 0.10;
        totalsal=(hra+da+ta)-(pf+it);
        System.out.println("Net Salary is:"+totalsal);
    }
}
class runemp
{
    public static void main(String args[]) 
    {
        emp e1=new emp();
        e1.accept();
        e1.display();
        e1.calsal();
    }
}
