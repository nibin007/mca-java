package shapes;
import java.util.*;




interface shape{
 void area();

}


public class Rectangle implements shape{
 int l,b;
 public Rectangle(int l,int b){
  this.l=l;
  this.b=b;
 }

 public void area() {
  System.out.println("Area of Rectangle: "+(l*b));
 }
}
