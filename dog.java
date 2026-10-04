 class animal{
        void sound(){
            System.out.println("animal sound");
        }
    }
   public class dog extends animal{
        void f1(){
            System.out.println("dog sounds");
        }
        public static void main(String[] args) {
            dog d=new dog();
            d.f1();
            d.sound();
        }
    }
    
    