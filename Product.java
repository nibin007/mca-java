import java.util.Scanner;

class Prod{
   String pcode;
   String name;
   int price;
   public Prod (){
               System.out.println("enter price : ");
              Scanner inp=new Scanner(System.in);  
              this.price=inp.nextInt();
               System.out.println("enter pcode : ");
              this.pcode=inp.next();     
               System.out.println("enter name: ");
              this.name=inp.next();     
              
   
   }
}
class Product{
   public static void main(String []args) {
         System.out.println("first product-- ");
           Prod obj=new Prod();
         System.out.println("Second product-- ");        
           Prod obj2=new Prod();
       System.out.println("third product-- ");        
             Prod obj3=new Prod();
        if(obj.price>=obj2.price && obj.price>=obj3.price){
              System.out.println("product-- "+obj.name+"have the highest price");
                  
        
        }
      
        else if(obj2.price>=obj.price && obj2.price>=obj3.price){
              System.out.println("product-- "+obj2.name+"have the highest price");
                  
        
        }
     
       else if(obj3.price>obj.price && obj3.price>obj.price){
              System.out.println("product-- "+obj3.name+"have the highest price");
                  
        
        }                       
   
   }

}
