public class constructorParametrized {
    int a,b;
    public constructorParametrized(int x,int y){
        a=x;
        b=y;
    }
    public void calculate(){
        int sum=a+b;
        System.out.println(sum);
    }
    public static void main(String[] args){
        constructorParametrized cs=new constructorParametrized(7,5); 
        cs.calculate();
    }
}