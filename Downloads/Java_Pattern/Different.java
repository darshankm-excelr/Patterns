public class Different{
    public static void main(String[] args) {
        int n=5;
        char c='A';
        for(int i=1;i<=n;i++,c+=2){
            for(int j=1;j<=i;j++){
                System.out.print((char)c+" ");
            }
            System.out.println();
        }
    }
}