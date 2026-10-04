class name{
    void nam(){
        System.out.println("name");
    }
}
public class oops extends name{
  void surname(){
    System.out.println("surname");
  }
  public static void main(String[] args){
    oops fullName=new oops();
    fullName.nam();
    fullName.surname();
  }
}