/*public class Thread1 extends Thread {
    public void run(){
        System.out.println("Thread method is running");
    }    
    public static void main(String[] args){
        Thread1 t=new Thread1();
        t.start();
    }
}
*/

/* 
class Thread3 extends Thread{
    public void run(){
        System.out.println("method 1 thread is running");
    }
}
class Thread2 extends Thread{
    public void run(){
        System.out.println("method 2 is running");
    }
}
public class Thread1{
    public static void main(String[] args){
        Thread3 th=new Thread3();
        Thread2 t=new Thread2();
        th.start();
        t.start();
    }
}

*/

/* 
public class Thread1{
    static{
        System.out.println("Thread is loded obtaining the reference of its Thread");
        Thread t=Thread.currentThread();
        System.out.println("Name & priority of this thread are:- "+t.getName()+"Thread" );
    try{
        System.out.println("Suspending current thread for 5 second");
        Thread.sleep(2000);
        System.out.println("Thread is resumed changing name and priotrity");
        t.setName("My name");
        t.setPriority(7);
    }
    catch(Exception e){
        System.out.println(e);
    }
}
    public static void main(String[] args){
        System.out.println("main() method invoked obtaining the refernce of itd invoking Thread");
        Thread t=Thread.currentThread();
        System.out.println("name & priority of this thread are:- "+t.getName()+"Thread"+t.getPriority());
        System.out.println("main method is running");
    }
}

*/

/* 
public class Thread1{
    static{
        System.out.println("static block is running");
        Thread t=Thread.currentThread();
        t.setName("table");
        System.out.println(t.getName());
        try{
            for(int i=1;i<=10;i++){
                System.out.println(2*i);
                Thread.sleep(1000);
            }
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
    public static void main(String[] args){

    }
}

*/

public class Thread1{
    static{
        Thread t=Thread.currentThread();
        System.out.println("song HIM");
        //t.setName("karan Aujila");
        System.out.println("name :-"+t.getName());
        try{
            Thread.sleep(1000);
            System.out.println("ni assi vi ni puchana dubaara");
            Thread.sleep(2000);
            System.out.println("saahanu lagda ayy mitraan nu\n marregi kuware tu");
            Thread.sleep(2000);
            System.out.println("ni cathe saada dill khush hoju");
            Thread.sleep(2000);
            System.out.println("bhaj langu aa gali cho aaja chadheya chubaare tu");
            Thread.sleep(2200);
            System.out.println("main ohado biba chhadd du ladaaia");
            Thread.sleep(2500);
            System.out.println("jadon teriyaan mere naal sachchi akhaan ladia");
            Thread.sleep(2500);
            System.out.println("ni assi ia tere pichchey - pichchey");
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
    public static void main(String[] args){
    
    }
}