import java.util.Scanner;

class Prime{

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        int cnt=0;
        for(int i=2;i*i<=n;i++){
            if(n%i==0){
                cnt++;
            }
        }
        if(cnt>0){
            System.out.println("Not Prime");
        }else{
            System.out.println("Prime");
        }
    }
}