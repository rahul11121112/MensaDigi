class X 
{ 
 public void methodX() 
 { 
   System.out.println("Class X method"); 
  } 
} 
class Y extends X 
{ 
  public void methodY() 
  { 
    System.out.println("Class Y method"); 
  } 
} 
class Z extends Y 
{ 
  public void methodZ() 
  { 
    System.out.println("Class Z method"); 
  } 
}
public class Multilevel{  
public static void main(String[] args) 
{ 
   Z z = new Z(); 
    z.methodX(); 
    z.methodY();  
    z.methodZ(); 
  } 
}