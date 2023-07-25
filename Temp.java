import java.awt.*;
import java.net.*;
import java.awt.event.*;
class Temp extends Frame{
    TextField Fahr;
    Button go;
    Label c2;
    Label cel;
    Temp(){
        Fahr=new TextField();
        cel=new Label("");
        cel.setBounds(100, 90, 145, 20);
        c2=new Label("enter the fahrenheit");
        c2.setBounds(100, 40, 145, 20);
        Fahr.setBounds(100, 60, 145, 20);
        go=new Button("Go");
        go.setBounds(100,80,50,40);
    
    add(Fahr);
    add(go);
    add(c2);
    add(cel);
   setSize(600, 600);   
   setVisible(true);


go.addActionListener(new ActionListener() {
   public void actionPerformed(ActionEvent e){
    int a=Integer.parseInt(Fahr.getText());
  

 double c=((5.0/9)*(a-32));
  
  cel.setText("celsius="+String.valueOf(c));

   } 
});
   };

public static void main(String args[]){
           
      new Temp();
}
    }
