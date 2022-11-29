package pojo1;

//Using POJO class objects in MainClass Java program  
//package Jtp.PojoDemo;  
public class MainClass {  
  public static void main(String[] args) {  
      // Create an Employee class object  
Employee obj= new Employee();  
obj.setName("Alisha"); // Setting the values using the set() method  
obj.setId("A001");  
obj.setSal(200000);  
System.out.println("Name: "+ obj.getName()); //Getting the values using the get() method  
System.out.println("Id: " + obj.getId());  
System.out.println("Salary: " +obj.getSal());  
  }  
}