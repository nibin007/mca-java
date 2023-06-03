package shapes;
import java.util.*;


interface shape{
 void area();

}
public class Square implements shape{
 int s;
 public Square(int s) {
  this.s = s;
 }
 public void area() {
  System.out.println(" ");
  System.out.println("Area of circle: "+(s*s));
 }

}
