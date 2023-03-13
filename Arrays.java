import java.util.Scanner;

class Arrays{
 public static void main(String[] args) {
  int temp;
   
   int[]a=new int[5];
   Scanner input=new Scanner(System.in);
   System.out.println("Enter  values:");
   for(int i = 0; i < a.length; i++) { 
        a[i]=input.nextInt();
        
   }
  
    
   for(int i = 0; i < a.length; i++) { 
      for(int j=i+1;j<a.length;j++){
         if(a[i]>a[j]){
           temp=a[i];
           a[i]=a[j];
           a[j]=temp;
         
         }
        
      }   
        
   }
     System.out.println("the sorted array  values are:");
       for(int i = 0; i < a.length; i++) { 
                 System.out.println(a[i]);
                    
    
    
    } 
     
   
 }
}
