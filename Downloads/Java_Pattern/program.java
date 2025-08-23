public class program{
    public static void recursion(int n){
       if(n==3){
          System.out.println(n);
            return;
       }
       System.err.println(n);
        recursion( n-1);
       
    }

    public static void main(String[] args){
        recursion(5);
        
    }
}