/*public class sBuffer {
    public static void main(String[] args){
        StringBuffer sf=new StringBuffer();
        sf.append("yash");
        sf.append(" ");
        sf.append("prajapati");
        String str =sf.toString();
        System.out.println(str);
    }
}
*/

 
class sBuffer{
    public static void main(String[] args){
        StringBuffer s=new StringBuffer();
        s.append("yash");
        System.out.println("not enter size "+s);
        StringBuffer str=new StringBuffer(8);
        str.append("prajapati121");
        System.out.println("size of string buffer 8 "+str); 
        StringBuffer st=new StringBuffer("hello");
        st.append("ward");
        System.out.println(st);  
    }
}
    

