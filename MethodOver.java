import java.util.*;
class calc{
    int s,l,b;
    calc(int side)
    {
        this.s=side;
    }
calc(int l,int b)
    {
        this.l=l;
        this.b=b;
    }



    int area(int s){
        this.s=s;
        return(s*s);
    }
    int area(int l,int b){
        this.l=l;
        this.b=b;
        return(l*b);
    }
}
class MethodOver{
    public static void main (String []args){
     
        int s,l,b;
        Scanner inp=new Scanner(System.in);
        System.out.println("Enter value of  side of square : ");
        s=inp.nextInt();
       calc obj=new calc(s);
        System.out.println("Enter the value of l and b :");
        l=inp.nextInt();
        b=inp.nextInt();
       calc obj2=new calc(l,b);
      
        System.out.println("Area of square :"+obj.area(s));

        System.out.println("Area of rectangle :"+obj2.area(obj2.l,obj2.b));
    }  
}