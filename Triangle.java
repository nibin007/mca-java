package shapes;
import java.util.*;


interface shape{
 void area();

}
public class Triangle implements shape{
 int b,h;
 public Triangle(int b, int h) {
  this.b = b;
  this.h = h;
  
 }
 public void area() {
  System.out.println(" ");
  System.out.println("Area of Triangle: "+(0.5*b*h));
 }

}
