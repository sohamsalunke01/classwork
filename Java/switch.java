import java.util.*;
class calt
{
    public static void main(String[] args)
     {

        System.out.println("Welcome to my Calculator");
        Scanner a=new Scanner(System.in);
        System.out.println("Enter 1st Number:");
        int n1=a.nextInt();
        System.out.println("Enter 2nd Number:");
        int n2=a.nextInt();
        System.out.println("Please select operation:\nEnter-'a' for(addtion)\nEnter-'s' for(substraction)\nEnter-'d' for(division)\nEnter-'m' for(multiplication):");
        Scanner b=new Scanner(System.in);

        String c=b.nextLine();
        switch (c) {
            case "a":
            System.out.println("Addition of "+n1+" and "+n2+" = "+(n1+n2));    
            break;
            case "s":
            System.out.println("Substration of "+n1+" and "+n2+" = "+(n1-n2));    
            break;
            case "d":
            System.out.println("Division of "+n1+" and "+n2+" = "+(n1/n2));    
            break;
            case "m":
            System.out.println("Multiplication of "+n1+" and "+n2+" = "+(n1*n2));    
            break;
            
            default:
            System.out.print("\nInvalide operator selected.\nThank You..!!!");

             break;
        }
    }
}