public class recursionPower {
    public static int power(int x,int n){
        if(n==0){
             return(1);
        }
        if(x==0){
            return(0);
        }
        int powernx=power(x,n-1);
        int powre=x*powernx;
        return powre;
    }
    public static void main(String[] args){
        int x=2,n=5;
        power(x,n);
        int ans=power(x,n);
        System.out.println(ans);
    }
    
}
