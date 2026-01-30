import java.util.Scanner;

public class Count_Digits {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int cnt=0;
        while(n!=0){
            cnt++;
            n=n/10;
        }
        System.out.println(cnt);
    }
}
