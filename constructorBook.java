/*create a book class with a constructor that initialize title,author and price
 then make an array of 5 book and print detail */

 import java.util.*;
 public class constructorBook {
    String  title;
    String  author;
    float  price ;
    public constructorBook(String til,String aut,float pric)
    {
        title =til;
        author=aut;
        price=pric;
        }
        public void prints(){
            System.out.println("  tille-- "+title+"  author--  "+author+"  price--  "+price);
        }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
       // String til=sc.nextLine();
        //String aut=sc.nextLine();
        //float pric=sc.nextFloat();
        constructorBook arr[]=new constructorBook[5];
        arr[0]=new constructorBook("c","yash",502);
        arr[1]=new constructorBook("physh","aayush",542);
        arr[2]=new constructorBook("math","arjun",245);
        arr[3]=new constructorBook("english","praful",845);
        arr[4]=new constructorBook("hindi","prajapati",474);
        for(int i=0;i<5;i++){
            arr[i].prints();
        }
        sc.close();
    }
}

