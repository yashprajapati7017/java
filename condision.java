import java.util.*;
public class condision {
  public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int age =sc.nextInt();
if(age<=18){
    System.out.println("younger");
}
else{
    System.out.println("not younger");
}
sc.close();
  }  
}
