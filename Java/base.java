import java.util.*;
class student
{   int rno;
    String name;
    void display()
    {
        System.out.println("\nStudent Information:\nRoll no:"+rno+"\nName:"+name);
    }
}
class base
{
    public static void main(String[] args) {
        System.out.println("Enter Your Roll Number:");
        Scanner s1=new Scanner(System.in);
        int r=s1.nextInt();
        System.out.println("Enter Your name:");
        Scanner s2=new Scanner(System.in);
        String nm=s2.nextLine();
        student a=new student();
        a.rno=r;
        a.name=nm;
        a.display();
    }
}