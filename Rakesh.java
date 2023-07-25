import java.util.Scanner;

class Member{
 String name,address,phno;
 int age,sal;
 void getdata(){
  Scanner input = new Scanner(System.in);
  System.out.print("Enter Name: ");
  name = input.next();
  System.out.print("Enter Age: ");
  age = input.nextInt();
  System.out.print("Enter Address: ");
  address = input.next();
  System.out.print("Enter Phone Number: ");
  phno = input.next();  
  System.out.print("Enter Salary : ");
  sal = input.nextInt();
 }
 void printsalary(){
  System.out.println();
  System.out.print("Salary :"+sal);
 }
 int putdata(){
  System.out.println("Name: "+name);
  System.out.println("Age: "+age);
  System.out.println("Address: "+address);
  System.out.println("Phone Number: "+phno);
  System.out.println("Salary : "+sal);
  return 0;
 }
}

class Employee extends Member{
 String specialization;
 void getdata(){
  super.getdata();
  Scanner inp = new Scanner(System.in);
  System.out.print("Enter Specialization: ");
  specialization = inp.next();
 }
 int putdata(){
  super.putdata(); 
  System.out.println("Specialization: "+specialization);
  return 0;
 }
}

class Manager extends Member{
 String dept;
 void getdata(){
  super.getdata();
  Scanner inp = new Scanner(System.in);
  System.out.print("Enter Department: ");
  dept = inp.next();
 }
 int putdata(){
  super.putdata(); 
  System.out.println("Department: "+dept);
  return 0;
 }
} 
 
class Rakesh{
 public static void main(String[] args){
  Employee obj1 = new Employee();
  Manager obj2 = new Manager(); 
  System.out.println("Enter Employee Details :");
  obj1.getdata();
  System.out.println();
  System.out.println("Enter Manager Details :");
  obj2.getdata();
  System.out.println();
  System.out.println(" Employee Details :");
  System.out.println("--------------------");
  obj1.putdata();
  System.out.println();
  System.out.println(" Manager Details :");
  System.out.println("--------------------");
  obj1.putdata();
  System.out.println();
 }
} 
 
