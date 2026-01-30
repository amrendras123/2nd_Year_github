import java.util.Scanner;

class Palindrome{
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();//12321
        int temp=n;
        int nn=0;
        while(n!=0){//reverse
            int rem=n%10;
            nn=nn*10+rem;
            n=n/10;
        }
        if(nn==temp){
            System.out.println("Palindrome number");
        }else{
            System.out.println("Not Palindrome");
        }
    }
}