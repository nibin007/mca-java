import java.util.Scanner;

public class ComplexNumber{
     double real;
     double img;
     public ComplexNumber(double real,double img){
          this.real=real;
          this.img=img;
       
     
     }
  public static void main(String[] args){
        System.out.println("enter the complex and real part of first element");
        Scanner input=new Scanner(System.in);
        double comp=input.nextDouble();
        double real=input.nextDouble();
        System.out.println("enter the complex and real part of first element");
        double compp=input.nextDouble();
        double reall=input.nextDouble();
        
        
        
        ComplexNumber obj1=new ComplexNumber(comp,real);
        
        ComplexNumber obj2=new ComplexNumber(compp,reall);
        ComplexNumber temp;  
        temp=add(obj1,obj2);
        System.out.printf("Sum = %.1f + %.1fi", temp.real, temp.img);
       
        
    
  
  }
    public static ComplexNumber add(ComplexNumber n1, ComplexNumber n2)
    {
        ComplexNumber temp = new ComplexNumber(0.0, 0.0);

        temp.real = n1.real + n2.real;
        temp.img = n1.img + n2.img;

        return(temp);
    }
}



