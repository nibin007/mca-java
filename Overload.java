import java.util.Scanner;
class A{
 int a,b;
 int area(int side){
   
   return(side*side);
  }
 int area(int a,int b){
  this.a=a;
  this.b=b;
  return(a*b);
  } 
 } 
class Overload{
public static void main(String []args){
  int a,b,side;
  Scanner inp=new Scanner(System.in);
  System.out.println("Enter the length and breadth of the rectangle:");
  a=inp.nextInt();
  b=inp.nextInt();
  System.out.println("Enter the side of the square:");  
  side=inp.nextInt();
  A obj=new A();
  System.out.println("Area of square="+obj.area(side));
  System.out.println("Area of rectangle="+obj.area(a,b));
  }
  }
  