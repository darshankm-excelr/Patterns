public class increaseCharacter{
    public static void main(String[] args) {
        int n=5;
        char p='A' ;
        for(int i=1; i<=n;i++,p++){
            for(int j=1;j<=i;j++){
                System.out.print((char)p+" ");
            }
            System.out.println();
        }
    }
}