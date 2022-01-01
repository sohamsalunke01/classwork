import java.util.*; 
public class as1A2 {
  public static void main(String[] args) {
      System.out.println("_________________Calculate Area and Perimeter of rectangle_________________");
      Scanner s1=new Scanner(System.in);
      System.out.println("Enter Length:");
      int length=s1.nextInt();
      System.out.println("Enter breadth:");
      int breadth=s1.nextInt();
      int area=length*breadth;
      int perimeter=2*(length+breadth);
      System.out.println("Area of Rectangle:"+area);
      System.out.println("Perimeter of Rectangle:"+perimeter);
  }  
}
