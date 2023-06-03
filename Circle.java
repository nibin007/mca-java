package shapes;
import java.util.*;




interface shape{
 void area();

}



class Circle implements shape{
 int r;
 public Circle(int r) {
  this.r = r;
 }
 public void area() {
  System.out.println(" ");
  System.out.println("Area of circle: "+(3.14*r*r));
 }

}


