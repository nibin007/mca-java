import java.util.Scanner;
class Book{
    int i_no;
    String b_name,au_name,pub;

    Book(int i_no,String b_name,String au_name,String pub){
        this.i_no=i_no;
        this.b_name=b_name;
        this.au_name=au_name;
        this.pub=pub;
    }
    void getBookDetails(){
       
         System.out.println("Book Bme:"+b_name+"\t Author Name: \t"+au_name+"\t Publisher: \t"+pub+"ISBN: \t"+i_no);

        }

}
public class Book1{
    public static void main(String[] args){
        System.out.println("Enter the no of Books: ");


        Scanner inp=new Scanner(System.in);
        int n=inp.nextInt();
   
        Book [] ob=new Book[n];
        for(int i=0;i<n;i++){
        System.out.println("Enter Name: ");
        String b_name=inp.next();
        System.out.println("Book Author: ");
        String au_name=inp.next();
        System.out.println("Publisher: ");
        String pub=inp.next();
        System.out.println("ISBN: ");
        int i_no=inp.nextInt();
        ob [i]=new Book(i_no,b_name,au_name,pub);
        System.out.println("\n --------------------------------------\n");
        

     }
     for(int i=0;i<n;i++){
         ob [i].getBookDetails();
     }

       
       // ob [0]=new Book(3,"a","b","n");
        //ob [1]=new Book(1,"e","f","f");

        //ob [0].display();
        //ob [1].display();

    }
    
}
