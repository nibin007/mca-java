import shapes.*;
import java.util.*;

public class Areas{
 public static void main(String[] args){
  Scanner inp=new Scanner(System.in);
  int ch,x;
  int rad,l,b,s,h,k;
  System.out.println("1.Circle- Area");
  System.out.println("2.Rectangle- Area");
  System.out.println("3.Square- Area");
  System.out.println("4.Triangle- Area");
  
  System.out.println("5.Exit");
  do
  {
   System.out.println(" ");
   System.out.print("Enter your choice [1/2/3/4/5] : ");
   ch=inp.nextInt();
   switch(ch){
    case 1 :  System.out.println("Enter Radious of circle: ");
	      rad = inp.nextInt();
	      Circle obj1= new Circle(rad);
	      obj1.area();
	      break;
    case 2 :  System.out.println("Enter length of rectangle: ");
	      l=inp.nextInt();
	      System.out.println("Enter breadth of rectangle: ");
	      b=inp.nextInt();
	      Rectangle obj2= new Rectangle(l,b);
	      obj2.area();
	      
	      
	      break;
	      
  
    case 3 :  System.out.println("Enter side of square: ");
	      s=inp.nextInt();
	     
	      Square obj3= new Square(s);
	      obj3.area();
	      
	      
	      break;
	      
    case 4 :  System.out.println("Enter base of  Triangle: ");
	      k=inp.nextInt();
	      System.out.println("Enter height of  Triangle: ");
	      h=inp.nextInt();
	     
	      Triangle obj4= new Triangle(k,h);
	      obj4.area();
	      
	      
	      break;
	
	      
    case 5 :  System.out.println("THANK YOU !!!  "); 
              break;
    default:  System.out.println("WRONG CHOICE !!!");
   }
  System.out.println("Do You Wanna Continue ? (0/1): ");
  x=inp.nextInt();
 }while(x==1);
}
}
