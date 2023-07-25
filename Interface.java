import java.util.*;
interface prototype{
  void circle();
 void rectangle();
 }
 
 class CircleCompute implements prototype{
 Scanner inp=new Scanner(System.in);
    public void circle(){
      double radius;
       System.out.print("Enter the radius:");
       radius=inp.nextDouble();
      
       double cir_area=3.14*radius*radius;
      double cir_peri=2*3.14*radius;
      System.out.println("Area of circle="+cir_area);
    System.out.println("Perimeter of circle="+cir_peri);
      
      }
      public void rectangle(){}
    }
   class RectCompute implements prototype{  
    Scanner inp=new Scanner(System.in);
    public void rectangle(){
        double length,breadth;
      System.out.print("Enter the length of the rectangle:");
      length=inp.nextDouble();
      System.out.print("Enter the breadth of the rectangle:");
      breadth=inp.nextDouble();
     
      double rect_area=length*breadth;
     double rect_peri=2*(length+breadth);
      System.out.println("Area of rectangle="+rect_area);
    System.out.println("Perimeter of rectangle="+rect_peri);
      }
      public void circle(){}
    }
    
public class Interface{
    public static void main(String[] args){
      CircleCompute obj=new CircleCompute();
       RectCompute obj2=new RectCompute();
       double length,breadth;
       Scanner inp=new Scanner(System.in);
     do
     {
        System.out.println("\n\n\n___MENU___\n1.Area and Perimeter of Circle.\n2.Area and perimeter of rectangle.\n3.Exit");
     System.out.print("Enter your choice:");
     int ch = inp.nextInt();
    switch (ch) {
                case 1:obj.circle();
                       break;
                case 2:obj2.rectangle();
                        break; 
                case 3:System.exit(0);
                        break;              
  
    
   
    }
    }while(true);  
    }
    }  