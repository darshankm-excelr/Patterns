
import java.util.Scanner;

public class Factor{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int count=0;
        for(int i=1;i<=n;i++){
            if(n%i==0){
                count++;
                System.out.println(i);
            }
        }
        System.out.println("Toatal count is:"+count);
    }
}