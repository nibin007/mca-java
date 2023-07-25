import java.util.Scanner;
import java.lang.Exception;

class NegException extends Exception{
    NegException(String str){
        System.out.println(str);

    }
}


public class PosExcept {
  public static void main(String args []){
        Scanner reader=new Scanner(System.in);
        double s=0;
        System.out.println("enter the limit");
        int n=reader.nextInt();
        System.out.println("enter the Numbers");
        
        for(int i=0;i<n;i++){
           double a=reader.nextInt();
            try{
                if(a<0){
                    i=i-1;
                    throw new NegException("NUMBERS CANT BE NEGATIVE--add another number");

                }
                else{
                    s=s+a;
                }
            }
            catch(NegException u){
                    System.out.println(u);
                        

            }
            
        }
        
            double avg=s/n;
                    System.out.println("average is "+avg);
        
  }    
}
